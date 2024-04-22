package com.kodilla.stream;                                                   // [1]

import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {                                                     // [4]

    public static void main(String[] args) {                                   // [5]
        Processor processor = new Processor();                                  // [6]
        Executor codeToExecute = () -> System.out.println("This is an example text.");  // [7]
        processor.execute(codeToExecute);                                       // [8]

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}