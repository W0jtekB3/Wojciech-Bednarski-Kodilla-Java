package com.kodilla.stream.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class BoardTestSuite {

    @Test
    void testAddTaskListAverageWorkingOnTask() {
        // Given
        Board board = prepareTestData();

        // When
        double averageDays = board.getTaskLists().stream()
                .filter(taskList -> taskList.getName().equals("In Progress"))
                .flatMap(taskList -> taskList.getTasks().stream())
                .mapToLong(task -> ChronoUnit.DAYS.between(task.getCreated(), LocalDate.now()))
                .average()
                .orElse(0);

        // Calculate the expected average manually based on the test data:
        // Task 5: created today (0 days)
        // Task 6: created 7 days ago
        // Average = (0 + 7) / 2 = 3.5
        double expectedAverage = 3.5;

        // Then
        System.out.println(averageDays);
        Assertions.assertEquals(expectedAverage, averageDays, 0.01);
    }

    private Board prepareTestData() {
        // users
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        // tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperature from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(15));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().plusDays(25));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(25),
                LocalDate.now().plusDays(5));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(20));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(7),
                LocalDate.now().plusDays(7));

        // taskLists
        TaskList taskListToDo = new TaskList("To Do", List.of(task1, task3));
        TaskList taskListInProgress = new TaskList("In Progress", List.of(task5, task6));
        TaskList taskListDone = new TaskList("Done", List.of(task2, task4));

        // board
        Board board = new Board("Project Weather Prediction");
        board.addTaskList(taskListToDo);
        board.addTaskList(taskListInProgress);
        board.addTaskList(taskListDone);
        return board;
    }
}
