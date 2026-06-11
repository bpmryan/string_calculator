package com.example;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
       
        // scenario where there is a comma 
        // dynamic loop to refactor any two-number solution 
        String[] tokens = numbers.split(",|\n");
        int sum = 0;
        
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }
}
