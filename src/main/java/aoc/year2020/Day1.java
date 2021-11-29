package main.java.aoc.year2020;

import java.io.IOException;
import java.util.stream.IntStream;
import main.java.Day;

public class Day1 extends Day {
    public static void main(String[] args) {
        System.out.println("Day1 is alive.");
    }

    /*         
    int[] report = {1721,979,366,299,675,1456}; 
    
    In this list, the two entries that sum to 2020 are 1721 and 299. 
    Multiplying them together produces 1721 * 299 = 514579, so the correct answer is 514579.
    */
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

    /*
    int[] report = {1721,979,366,299,675,1456}; 

    In this list, the three entries that sum to 2020 are 979, 366, and 675. 
    Multiplying them together produces the answer, 241861950.
    */
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
