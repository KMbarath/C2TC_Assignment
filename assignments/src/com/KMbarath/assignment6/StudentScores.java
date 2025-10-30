package com.KMbarath.assignment6;

import java.util.ArrayList;

public class StudentScores {
    private int[] scores;

    public StudentScores(int[] scores) {
        this.scores = scores;
    }

    public ArrayList<Integer> getScoresList() {
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (int score : scores) {
            scoreList.add(score);
        }
        return scoreList;
    }

}
