package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    private final String name;
    private final List<Task> tasks;

    public TaskList(final String name, final List<Task> tasks) {
        this.name = name;
        this.tasks = new ArrayList<>(tasks);
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "name='" + name + '\'' +
                ", tasks=" + tasks +
                '}';
    }
}
