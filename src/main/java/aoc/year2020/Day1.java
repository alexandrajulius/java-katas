package main.java.aoc.year2020;

import java.io.IOException;
import java.util.stream.IntStream;

import main.java.aoc.common.Day;

public class Day1 extends Day {
    public static void main(String[] args) {
        System.out.println("Day1 is here.");
    }

    public static int firstTask(int[] report) throws IOException {
        for(int i = 0; i < report.length - 1; i++) {
            Integer temp = 2020 - report[i];
            boolean isSummandOf2020 = IntStream.of(report).anyMatch(x -> x == temp);
            if (isSummandOf2020) {
                return report[i] * temp;
            }
        }

        return 1;
    }
    
    public static int secondTask(int[] report) {
        for(int i = 0; i < report.length - 1; i++) {
            for(int j = 0; j < report.length - 1; j++) {
                Integer temp = 2020 - report[i] - report[j];
                boolean isSummandOf2020 = IntStream.of(report).anyMatch(x -> x == temp);
                if (isSummandOf2020) {
                    return report[i] * report[j] * temp;
                }
            }    
        }

        return 1;
    }
}
