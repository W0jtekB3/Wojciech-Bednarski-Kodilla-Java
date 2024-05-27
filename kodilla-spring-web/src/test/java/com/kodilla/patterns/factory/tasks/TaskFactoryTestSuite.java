package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();

        // Then
        assertEquals("Buy groceries", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();

        // Then
        assertEquals("Paint wall", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        // Given
        TaskFactory factory = new TaskFactory();

        // When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();

        // Then
        assertEquals("Drive to work", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
}
