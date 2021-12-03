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
        String[] bitLanes = Day3.convertToBitLanes(report);
   
        for (String line : bitLanes) {
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

    private static String[] convertToBitLanes(String[] report)
    {
        String[] bitLanes = new String[report[0].length()];
        Arrays.fill(bitLanes, "");
        for (int i = 0; i < report.length; i++) {
            for (int j = 0; j < report[i].length(); j++) {
                bitLanes[j] = bitLanes[j] + String.valueOf(report[i].charAt(j));
            }
        } 

        return bitLanes;
    }

    public static int secondTask(String[] report) throws IOException {  
        List<String> oxygenRating = Day3.getRating(report, "oxygen");
        List<String> co2ScrubberRating = Day3.getRating(report, "co2Scrubber");

        int oxygen = Integer.parseInt(oxygenRating.get(0), 2);
        int co2Scrubber = Integer.parseInt(co2ScrubberRating.get(0), 2);

        return oxygen * co2Scrubber;
    }

    private static List<String> getRating(String[] report, String type)
    {
        List<String> ratings = new ArrayList<>(Arrays.asList(report));
        for (int i = 0; i < report.length; i++) {
            if (ratings.size() == 1) {
                break;
            }
            int zeros = 0;
            int ones = 0;
            for (String line : ratings) {
                if (line.charAt(i) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }

            if (zeros > ones) {
                int finalI = i;
                if (type.equals("oxygen")) {
                    ratings.removeIf(line -> line.charAt(finalI) == '0');
                } else {
                    ratings.removeIf(line -> line.charAt(finalI) == '1');
                }
            } else {
                int finalI = i;
                if (type.equals("oxygen")) {
                    ratings.removeIf(line -> line.charAt(finalI) == '1');
                } else {
                    ratings.removeIf(line -> line.charAt(finalI) == '0');
                }            
            }
        }

        return ratings;
    }
}
