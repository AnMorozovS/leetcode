package com.anmorozov.leetcode.problems.solutions.p2305;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.OutputTimeUnit;

public class BenchMarkTest {

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void initApproach1() throws IOException {
        SolutionRecord solutionRecord = getSolutionRecord();

        Solution solution = new Approach1();
        solution.distributeCookies(solutionRecord.cookies(), solutionRecord.k());
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void initMyApproach1() throws IOException {
        SolutionRecord solutionRecord = getSolutionRecord();

        Solution solution = new MyApproach1();
        solution.distributeCookies(solutionRecord.cookies(), solutionRecord.k());
    }

    private SolutionRecord getSolutionRecord() throws IOException {
        InputStream is = BenchMarkTest.class.getResourceAsStream(BenchMarkTest.class.getSimpleName() + ".json");
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(is, new TypeReference<>() {
        });
    }
}
