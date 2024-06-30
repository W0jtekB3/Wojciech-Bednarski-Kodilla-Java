package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.dao.TaskListDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.List;

import static com.kodilla.hibernate.tasklist.dao.TaskListDaoTestSuite.LISTNAME;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;

    @Autowired
    private TaskListDao taskListDao;

    private static final String DESCRIPTION = "Test task description";

    @Test
    void testTaskDaoSave() {
        // Given
        Task task = new Task("Test: Learn Hibernate", 7);

        // When
        taskDao.save(task);

        // Then
        assertNotNull(task.getId());
    }

    @Test
    void testTaskDaoFindByDuration() {
        // Given
        Task task = new Task("Test: Find by Duration", 7);
        taskDao.save(task);
        int duration = task.getDuration();

        // When
        List<Task> readTasks = taskDao.findByDuration(duration);

        // Then
        assertFalse(readTasks.isEmpty());

        // CleanUp
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }

    @Test
    void testTaskDaoSaveWithFinancialDetails() {
        // Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        // When
        taskDao.save(task);
        int id = task.getId();

        // Then
        assertNotEquals(0, id);

        // CleanUp
        taskDao.deleteById(id);
    }

    @Test
    void testTaskListDaoSaveWithTasks() {
        // Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        // When
        taskListDao.save(taskList);
        int id = taskList.getId();

        // Then
        assertNotEquals(0, id);

        // CleanUp
        taskListDao.deleteById(id);
    }
}