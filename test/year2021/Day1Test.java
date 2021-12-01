package year2021;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import org.junit.Test;
import main.java.aoc.year2021.Day1;

public class Day1Test {

    @Test 
    public void testTaskOneWithDummyReport() throws IOException {
        int[] report = {199,200,208,210,200,207,240,269,260,263};

        assertEquals(7, Day1.firstTask(report));
    }

    @Test 
    public void testTaskOneWithReport() throws IOException {
        int[] report = Day1.fileToArray("bin/main/resources/year2021/day1.txt");

        assertEquals(7, Day1.firstTask(report));
    }

    @Test 
    public void testTaskTwoWithDummyReport() throws IOException {
        int[] report = {199,200,208,210,200,207,240,269,260,263};

        assertEquals(5, Day1.secondTask(report));
    }

    @Test 
    public void testTaskTwoWithReport() throws IOException {
        int[] report = Day1.fileToArray("bin/main/resources/year2021/day1.txt");

        assertEquals(1158, Day1.secondTask(report));
    }
}
