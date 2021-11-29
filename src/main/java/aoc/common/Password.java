package main.java.aoc.common;

final public class Password 
{
    String rule;
    String password;

    public Password(String rule, String password)
    {
        this.rule = rule;
        this.password = password;
    }

    public boolean isValidFirstTask() {
        
        String[] splitRule = this.rule.split(" ");
        String countRange = splitRule[0];
        String letter = splitRule[1];
        
        String[] splitCountRange = countRange.split("-");
        int from = Integer.parseInt(splitCountRange[0]);
        int to = Integer.parseInt(splitCountRange[1]);

        int count = 0;
        for (int i = 0; i < this.password.length(); i++) {
            if (this.password.charAt(i) == letter.charAt(0)) {
                count++;
            }
        }

        return count >= from && count <= to;
    }

    public boolean isValidSecondTask() {
        
        String[] splitRule = this.rule.split(" ");
        String requiredPos = splitRule[0];
        String needle = splitRule[1];
        
        String[] splitCountRange = requiredPos.split("-");
        int first = Integer.parseInt(splitCountRange[0]);
        int second = Integer.parseInt(splitCountRange[1]);

        if (this.password.length() < second - 1) {
            return false;
        }

        return this.password.charAt(first) == needle.charAt(0) || 
        this.password.charAt(second) == needle.charAt(0);
    }

    public String getRule() {
        return this.rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}