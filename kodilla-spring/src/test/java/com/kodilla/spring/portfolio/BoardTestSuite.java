// src/test/java/com/kodilla/spring/portfolio/BoardTestSuite.java
package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        // Given
        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        // When
        toDoList.addTask("Task to do");
        inProgressList.addTask("Task in progress");
        doneList.addTask("Task done");

        // Then
        assertEquals(1, toDoList.getTasks().size());
        assertEquals("Task to do", toDoList.getTasks().get(0));
        assertEquals(1, inProgressList.getTasks().size());
        assertEquals("Task in progress", inProgressList.getTasks().get(0));
        assertEquals(1, doneList.getTasks().size());
        assertEquals("Task done", doneList.getTasks().get(0));
    }
}
