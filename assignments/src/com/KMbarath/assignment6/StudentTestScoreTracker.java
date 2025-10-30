package com.KMbarath.assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScoreTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        StudentScores student = new StudentScores(scores);

        ArrayList<Integer> scoreList = student.getScoresList();

        System.out.println("Elements in the ArrayList:");
        for (int score : scoreList) {
            System.out.println(score);
        }

        sc.close();
    }

}
