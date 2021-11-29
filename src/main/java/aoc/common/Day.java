package main.java.aoc.common;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Day 
{
    public static int[] fileToArray(String pathToFile) throws IOException
    {
        String stringFromFile = Day.fileToString(pathToFile);
        String[] strArray = stringFromFile.split(",");
      
        int[] intArray = new int[strArray.length];
      
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        
        return intArray;
    }   

    public static String fileToString(String filename) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder builder = new StringBuilder();
        String line;    

        // For every line in the file, append it to the string builder
        while((line = reader.readLine()) != null)
        {
            builder.append(line).append(",");
        }

        reader.close();
        return builder.toString();
    }
}
