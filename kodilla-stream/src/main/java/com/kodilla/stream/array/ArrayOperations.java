package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;


public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println("Element at index " + i + ": " + numbers[i]));

        double average = Arrays.stream(numbers)
                .average()
                .orElse(0);

        return average;
    }
}
