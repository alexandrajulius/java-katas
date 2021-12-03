package main.java.aoc.year2021;

import java.util.*;
import java.io.IOException;
import main.java.aoc.common.Day;

public class Day3 extends Day {
    public static void main(String[] args) {
        System.out.println("Day3 is here.");
    }

    public static int firstTask(String[] report) throws IOException {  
        String gamma = new String("");
        String epsilon = new String("");
        String[] countList = new String[report[0].length()];
        Arrays.fill(countList, "");
        for (int i = 0; i < report.length; i++) {
            for (int j = 0; j < report[i].length(); j++) {
                countList[j] = countList[j] + String.valueOf(report[i].charAt(j));
            }
        }        
        for (String line : countList) {
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < line.length(); i++) {
                if (String.valueOf(line.charAt(i)).equals("0")) {
                    zeros++;
                } else {
                    ones++;
                }
            }
    
            if (zeros > ones) {
                gamma = gamma.concat("0");
                epsilon = epsilon.concat("1");
            } else {
                gamma = gamma.concat("1");
                epsilon = epsilon.concat("0");
            }
        }
        return Integer.parseInt(gamma.toString(), 2) * Integer.parseInt(epsilon.toString(), 2);
    }
}
