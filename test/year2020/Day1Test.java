package year2020;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import org.junit.Test;

import main.java.aoc.year2020.*;

public class Day1Test {

    @Test 
    public void testTaskOneWithDummyReport() throws IOException {
        int[] report = {1721,979,366,299,675,1456};

        assertEquals(514579, Day1.firstTask(report));
    }

    @Test 
    public void testTaskOneWithReport() throws IOException {
        int[] report = Day1.fileToArray("bin/main/resources/year2020/day1.txt");

        assertEquals(858496, Day1.firstTask(report));
    }

    @Test 
    public void testTaskTwoWithDummyReport() throws IOException {
        int[] report = {1721,979,366,299,675,1456};

        assertEquals(241861950, Day1.secondTask(report));
    }

    @Test 
    public void testTaskTwoWithReport() throws IOException {
        int[] report = Day1.fileToArray("bin/main/resources/year2020/day1.txt");

        assertEquals(263819430, Day1.secondTask(report));
    }
}