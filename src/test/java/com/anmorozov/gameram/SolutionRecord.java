package com.anmorozov.gameram;

import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.params.provider.Arguments.arguments;

record SolutionRecord(String message, String input, boolean output) {

    public static Arguments getArguments(SolutionRecord s) {

        return arguments(s.message, s.input, s.output);
    }
}