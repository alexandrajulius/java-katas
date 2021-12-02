package year2020;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import org.junit.Test;

import main.java.aoc.common.Day;
import main.java.aoc.common.PasswordExtractor;
import main.java.aoc.year2020.*;

public class Day2Test {

    @Test 
    public void testTaskOneWithDummyReport() throws IOException {
        String[] passwords = {
            "1-3 a: abcde",
            "1-3 b: cdefg",
            "2-9 c: ccccccccc"
        };

        assertEquals(2, Day2.firstTask(passwords));
    }

    @Test 
    public void testTaskOneWithReport() throws IOException {
        String[] stringList = Day.getListOfStrings("bin/main/resources/year2020/day2.txt");

        assertEquals(546, Day2.firstTask(stringList));
    }

    @Test 
    public void testTaskTwoWithReport() throws IOException {
    
        String[] stringList = Day.getListOfStrings("bin/main/resources/year2020/day2.txt");

        assertEquals(275, Day2.secondTask(stringList));
    }
}