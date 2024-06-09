package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.CrudRepository;
import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskListDao extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);

    void deleteById(int id);

    void save(TaskList taskList);
}
