package com.kodilla.testing.calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 3);
        int result2 = calculator.subtract(5, 3);
        System.out.println(result1);
        System.out.println(result2);

    }
}