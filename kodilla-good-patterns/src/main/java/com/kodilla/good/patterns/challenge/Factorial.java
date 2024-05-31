package com.kodilla.good.patterns.challenge;

public class Factorial {
    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int number = 5; // Change this to test with different numbers
        long result = factorial.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
