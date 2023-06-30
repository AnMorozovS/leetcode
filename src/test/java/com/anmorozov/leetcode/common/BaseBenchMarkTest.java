package com.anmorozov.leetcode.common;

import com.anmorozov.leetcode.problems.solutions.p1970.BenchMarkTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

public class BaseBenchMarkTest {

    @Test
    @Disabled("Because of too long execution time")
    public void runBenchmarks() throws Exception {
        Options options = new OptionsBuilder()
                .include(BenchMarkTest.class.getName() + ".*")
                .mode(Mode.AverageTime)
                .warmupTime(TimeValue.seconds(1))
                .warmupIterations(2)
                .threads(1)
                .measurementIterations(2)
                .forks(1)
                .shouldFailOnError(false)
                .shouldDoGC(true)
                .build();

        new Runner(options).run();
    }
}
