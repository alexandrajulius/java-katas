package main.java.aoc.year2021;

import java.io.IOException;
import java.util.Arrays;

import main.java.aoc.common.Day;

public class Day1 extends Day {
    public static void main(String[] args) {
        System.out.println("Day1 is here.");
    }

    public static int firstTask(int[] report) throws IOException {
        int count = 0;
        for(int i = 1; i < report.length; i++) {
            if (report[i] > report[i - 1]) {
                count++;
            }
        }

        return count;
    }

    public static int secondTask(int[] report) throws IOException {
        int k = 3;
        int n = report.length;
        int currentSum = 0;
        int[] slices = new int[n - k + 1];
        for(int i = 0; i < k; i++)
            currentSum += report[i];
        slices[0] = currentSum;

        for(int i = 1; i < n - k + 1; i++) {
            int tempSum = currentSum + report[i + k - 1] - report[i - 1];
            slices[i] = tempSum;
            currentSum = tempSum;
        }

        return Day1.firstTask(slices);
    }
}
