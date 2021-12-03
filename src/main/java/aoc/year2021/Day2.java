package main.java.aoc.year2021;

import java.io.IOException;
import main.java.aoc.common.Day;

public class Day2 extends Day {
    public static void main(String[] args) {
        System.out.println("Day2 is here.");
    }

    public static int firstTask(String[] report) throws IOException {
        int horizontal = 0;
        int depth = 0;
        for(int i = 0; i < report.length; i++) {
            String[] splitInstruction = report[i].split(" ");
            if (splitInstruction[0].equals("forward")) {
                horizontal += Integer.parseInt(splitInstruction[1]);
            }
            if (splitInstruction[0].equals("up")) {
                depth -= Integer.parseInt(splitInstruction[1]);
            }
            if (splitInstruction[0].equals("down")) {
                depth += Integer.parseInt(splitInstruction[1]);
            }
        }

        return horizontal * depth;
    }

    public static int secondTask(String[] report) throws IOException {
        int horizontal = 0;
        int depth = 0;
        int aim = 0;
        for(int i = 0; i < report.length; i++) {
            String[] splitInstruction = report[i].split(" ");
            if (splitInstruction[0].equals("down")) {
                aim += Integer.parseInt(splitInstruction[1]);
            }
            if (splitInstruction[0].equals("forward")) {
                horizontal += Integer.parseInt(splitInstruction[1]);
                depth += aim * Integer.parseInt(splitInstruction[1]);
            }
            if (splitInstruction[0].equals("up")) {
                aim -= Integer.parseInt(splitInstruction[1]);
            }
        }

        return horizontal * depth;
    }
    
}
