package com.anmorozov.leetcode.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class CoreTest {

    public static <T> Stream<Arguments> prepareIntegerInIntegerOut(Function<Integer, T> func) {
        StackWalker walker = StackWalker.getInstance();
        String methodName = walker.walk(frames -> frames
                .skip(1).findFirst()
                .map(StackWalker.StackFrame::getMethodName)).orElse(null);
        System.out.println(methodName);

        InputStream is = CoreTest.class.getResourceAsStream(methodName + ".json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<IntegerNIntegerOutput> list = objectMapper.readValue(is, new TypeReference<>() {
            });
            return list.stream().map(s -> Arguments.arguments(s.message, func.apply(s.n), s.output));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Stream.of();
    }

    public static Stream<Arguments> prepareIntegerArrayNIntegerOutput() {
        StackWalker walker = StackWalker.getInstance();
        String methodName = walker.walk(frames -> frames
                .skip(1).findFirst()
                .map(StackWalker.StackFrame::getMethodName)).orElse(null);
        System.out.println(methodName);

        InputStream is = CoreTest.class.getResourceAsStream(methodName + ".json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<IntegerArrayNIntegerOutput> list = objectMapper.readValue(is, new TypeReference<>() {
            });
            return list.stream().map(s -> Arguments.arguments(s.message, s.n, s.output));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Stream.of();
    }

    record IntegerNIntegerOutput(String message, int n, int output) {

    }

    record IntegerArrayNIntegerOutput(String message, int[] n, int output) {

    }
}
