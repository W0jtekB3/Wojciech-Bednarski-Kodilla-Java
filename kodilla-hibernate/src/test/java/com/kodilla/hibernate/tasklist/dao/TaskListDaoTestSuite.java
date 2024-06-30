package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    public static final String LISTNAME = "Test List";
    private static final String DESCRIPTION = "Test Description";

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);

        // When
        List<TaskList> readTaskLists = taskListDao.findByListName(LISTNAME);

        // Then
        Assertions.assertEquals(1, readTaskLists.size());
        Assertions.assertEquals(LISTNAME, readTaskLists.get(0).getListName());

        // Clean up
        int id = readTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
