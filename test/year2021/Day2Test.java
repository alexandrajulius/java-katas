package year2021;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import org.junit.Test;
import main.java.aoc.common.Day;
import main.java.aoc.year2021.Day2;

public class Day2Test {
    
    @Test 
    public void testTaskOneWithDummyReport() throws IOException {
        String[] report = {"forward 5", "down 5","forward 8","up 3","down 8","forward 2"};

        assertEquals(150, Day2.firstTask(report));
    }

    @Test 
    public void testTaskOneWithReport() throws IOException {
        String[] stringList = Day.getListOfStrings("bin/main/resources/year2021/day2.txt");

        assertEquals(2039912, Day2.firstTask(stringList));
    }

    @Test 
    public void testTaskTwoWithDummyReport() throws IOException {
        String[] report = {"forward 5", "down 5","forward 8","up 3","down 8","forward 2"};

        assertEquals(900, Day2.secondTask(report));
    }

    @Test 
    public void testTaskTwoWithReport() throws IOException {
        String[] stringList = Day.getListOfStrings("bin/main/resources/year2021/day2.txt");

        assertEquals(1942068080, Day2.secondTask(stringList));
    }

}
