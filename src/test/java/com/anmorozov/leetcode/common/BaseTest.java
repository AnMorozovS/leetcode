package com.anmorozov.leetcode.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.params.provider.Arguments;

public class BaseTest<T, E> {

    protected static List<Arguments> testCases;
    private final TypeReference<List<E>> typeReference;
    private final Function<E, Arguments> func;
    private final String jsonName;
    private final Class<T> classForResource;

    public BaseTest(Class<T> classForResource, TypeReference<List<E>> typeReference,
                    Function<E, Arguments> func) {
        this(classForResource, typeReference, func, classForResource.getSimpleName());
    }

    public BaseTest(Class<T> classForResource, TypeReference<List<E>> typeReference,
                    Function<E, Arguments> func, String jsonName) {
        this.classForResource = classForResource;
        this.typeReference = typeReference;
        this.func = func;
        this.jsonName = jsonName;
    }

    public List<Arguments> prepare() throws IOException {
        InputStream is = classForResource.getResourceAsStream(jsonName + ".json");

        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(is, typeReference).stream().map(func).toList();
    }
}
