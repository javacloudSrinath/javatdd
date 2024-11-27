package org.example;

public class StringCalculator {
    public static int sum(String numberString) {
        if (numberString.trim().isEmpty())
            return 0;
        int sum = 0;
        String[] numberArray = numberString.split(",");
        if (numberArray.length > 2)
            throw new RuntimeException("Input string can not have more than two numbers");

        for (String number : numberArray)
            sum += Integer.parseInt(number);

        return sum;
    }
}
