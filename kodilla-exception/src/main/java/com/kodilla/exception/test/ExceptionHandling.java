package com.kodilla.exception.test;

public class ExceptionHandling {

    public void handleSecondChallenge() {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(1.5, 1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Handling complete.");
        }
    }
}
