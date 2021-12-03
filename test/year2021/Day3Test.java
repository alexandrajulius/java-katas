package year2021;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.IOException;
import org.junit.Test;
import main.java.aoc.common.Day;
import main.java.aoc.year2021.Day3;

public class Day3Test {
    
    @Test 
    public void testTaskOneWithDummyReport() throws IOException {
        String[] report = {"00100","11110","10110","10111","10101","01111","00111","11100","10000","11001","00010","01010"};
        
        assertEquals(198, Day3.firstTask(report));
    }

    @Test 
    public void testTaskOneWithReport() throws IOException {
        String[] stringList = Day.getListOfStrings("bin/main/resources/year2021/day3.txt");
        
        assertEquals(2595824, Day3.firstTask(stringList));
    }
}