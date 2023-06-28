package com.anmorozov.leetcode.problems.solutions.p1971;

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
        solution.validPath(solutionRecord.n(), solutionRecord.edges(), solutionRecord.source(),
                solutionRecord.destination());
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void initApproach2() throws IOException {
        SolutionRecord solutionRecord = getSolutionRecord();

        Solution solution = new Approach2();
        solution.validPath(solutionRecord.n(), solutionRecord.edges(), solutionRecord.source(),
                solutionRecord.destination());
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void initApproach3() throws IOException {
        SolutionRecord solutionRecord = getSolutionRecord();

        Solution solution = new Approach3();
        solution.validPath(solutionRecord.n(), solutionRecord.edges(), solutionRecord.source(),
                solutionRecord.destination());
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void initApproach4() throws IOException {
        SolutionRecord solutionRecord = getSolutionRecord();

        Solution solution = new Approach4();
        solution.validPath(solutionRecord.n(), solutionRecord.edges(), solutionRecord.source(),
                solutionRecord.destination());
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void initMyApproach1() throws IOException {
        SolutionRecord solutionRecord = getSolutionRecord();

        Solution solution = new MyApproach1();
        solution.validPath(solutionRecord.n(), solutionRecord.edges(), solutionRecord.source(),
                solutionRecord.destination());
    }

    private SolutionRecord getSolutionRecord() throws IOException {
        InputStream is = BenchMarkTest.class.getResourceAsStream(BenchMarkTest.class.getSimpleName() + ".json");
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(is, new TypeReference<>() {
        });
    }
}
