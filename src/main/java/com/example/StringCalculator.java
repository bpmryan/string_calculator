package com.example;

import java.util.ArrayList;
import java.util.List;

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
        // collection to store any negative numbers 
        List<String> negatives = new ArrayList<>();
        
        for (String token : tokens) {
            int value = Integer.parseInt(token);
            if (value < 0) {
                negatives.add(token); //collect the violation
            }
            sum += value;
        }

        // report all negative numbers at once if there are any
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + String.join(", ", negatives));
        }

        return sum;
    }
}
