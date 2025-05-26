package com.mycompany.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    private StudentAnalyzer analyzer;

    @BeforeEach
    public void setUp() {
        analyzer = new StudentAnalyzer();
    }

    @Test
    public void testCountScoresInExcellentRange_NormalCase() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(2, analyzer.countScoresInExcellentRange(scores));
    }

    @Test
    public void testCountScoresInExcellentRange_EmptyList() {
        assertEquals(0, analyzer.countScoresInExcellentRange(Collections.emptyList()));
    }

    @Test
    public void testCountScoresInExcellentRange_NullList() {
        assertEquals(0, analyzer.countScoresInExcellentRange(null),
                     "Null list should return 0 for countExcellentStudents");
    }

    @Test
    public void testCountScoresInExcellentRange_AllInvalid() {
        List<Double> scores = Arrays.asList(-2.0, 11.5, null);
        assertEquals(0, analyzer.countScoresInExcellentRange(scores));
    }

    @Test
    public void testCalculateValidAverage_NormalCase() {
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001);
    }

    @Test
    public void testCalculateValidAverage_NullList() {
        assertEquals(0.0, analyzer.calculateValidAverage(null), 0.001,
                     "Null list should return 0.0 for calculateValidAverage");
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        List<Double> scores = Arrays.asList(-5.0, 15.0, null);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.001);
    }

    @Test
    public void testCalculateValidAverage_OnlyOneValid() {
        List<Double> scores = Arrays.asList(null, -1.0, 9.0);
        assertEquals(9.0, analyzer.calculateValidAverage(scores), 0.001);
    }
}
