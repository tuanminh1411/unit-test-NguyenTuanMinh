package com.mycompany.student;

import java.util.List;

public class StudentAnalyzer {

    private static final double MIN_SCORE = 0.0;
    private static final double MAX_SCORE = 10.0;
    private static final double EXCELLENT_THRESHOLD = 8.0;

    public int countScoresInExcellentRange(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0;

        int count = 0;
        for (Double score : scores) {
            if (isValidScore(score) && score >= EXCELLENT_THRESHOLD) {
                count++;
            }
        }
        return count;
    }

    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) return 0.0;

        double total = 0;
        int count = 0;
        for (Double score : scores) {
            if (isValidScore(score)) {
                total += score;
                count++;
            }
        }
        return count == 0 ? 0.0 : total / count;
    }

    private boolean isValidScore(Double score) {
        return score != null && score >= MIN_SCORE && score <= MAX_SCORE;
    }
}
