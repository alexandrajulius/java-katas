package main.java.aoc.year2020;

import main.java.aoc.common.Day;
import main.java.aoc.common.Password;
import main.java.aoc.common.PasswordExtractor;

public class Day2 extends Day {
    public static void main(String[] args) {
        System.out.println("Day2 is here.");
    }

    public static int firstTask(String[] passwords)
    {
        Password[] pwdList = PasswordExtractor.getPasswordList(passwords);

        int countValidPwd = 0;
        for (int i = 0; i < pwdList.length; i++) {
            if (pwdList[i].isValidFirstTask()) {
                countValidPwd++;
            }
        }

        return countValidPwd;
    }

    public static int secondTask(String[] passwords)
    {
        Password[] pwdList = PasswordExtractor.getPasswordList(passwords);

        int countValidPwd = 0;
        for (int i = 0; i < pwdList.length; i++) {
            if (pwdList[i].isValidSecondTask()) {
                countValidPwd++;
            }
        }

        return countValidPwd;
    }
}
