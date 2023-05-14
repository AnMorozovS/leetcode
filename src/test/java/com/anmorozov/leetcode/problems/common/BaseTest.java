package com.anmorozov.leetcode.problems.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.params.provider.Arguments;

public class BaseTest<T, E> {

    private final Class<T> childClass;
    private final TypeReference<List<E>> typeReference;
    private final Function<E, Arguments> func;
    private final String jsonName;

    public BaseTest(Class<T> childClass, TypeReference<List<E>> typeReference,
                    Function<E, Arguments> func) {
        this(childClass, typeReference, func, childClass.getSimpleName());
    }

    public BaseTest(Class<T> childClass, TypeReference<List<E>> typeReference,
                    Function<E, Arguments> func, String jsonName) {
        this.childClass = childClass;
        this.typeReference = typeReference;
        this.func = func;
        this.jsonName = jsonName;
    }

    public List<Arguments> prepare() throws IOException {
        InputStream is = childClass.getResourceAsStream(jsonName + ".json");

        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.readValue(is, typeReference).stream().map(func).toList();
    }
}
