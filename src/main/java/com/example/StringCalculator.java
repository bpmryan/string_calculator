package com.example;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        // Default delimiters
        String delimiter = ",|\n";
        String numbersWithoutPrefix = numbers;

        // check for custom delimiter prefix
        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, newlineIndex);
            numbersWithoutPrefix = numbers.substring(newlineIndex + 1);
        }

        // scenario where there is a comma
        // dynamic loop to refactor any two-number solution
        String[] tokens = numbersWithoutPrefix.split(delimiter);
        int sum = 0;
        
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}
