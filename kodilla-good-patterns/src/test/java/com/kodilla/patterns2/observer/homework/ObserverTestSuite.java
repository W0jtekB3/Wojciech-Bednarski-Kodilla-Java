package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverTestSuite {
    @Test
    public void testObserver() {
        // Given
        StudentTaskQueue studentQueue1 = new StudentTaskQueue("Student 1");
        StudentTaskQueue studentQueue2 = new StudentTaskQueue("Student 2");
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");

        studentQueue1.addObserver(mentor1);
        studentQueue1.addObserver(mentor2);
        studentQueue2.addObserver(mentor2);

        // When
        studentQueue1.addTask("Task 1 for Student 1");
        studentQueue2.addTask("Task 1 for Student 2");
        studentQueue1.addTask("Task 2 for Student 1");
        studentQueue2.addTask("Task 2 for Student 2");

        // Then
        assertEquals(2, mentor1.getTaskCount());
        assertEquals(4, mentor2.getTaskCount());
    }
}
