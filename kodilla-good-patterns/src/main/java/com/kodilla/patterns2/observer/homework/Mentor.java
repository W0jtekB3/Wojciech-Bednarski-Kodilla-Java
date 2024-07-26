package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int taskCount = 0;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        if (observable instanceof StudentTaskQueue) {
            StudentTaskQueue queue = (StudentTaskQueue) observable;
            System.out.println(name + " received a new task from " + queue.getStudentName() + ". Total tasks: " + queue.getTasks().size());
            taskCount++;
        }
    }

    public int getTaskCount() {
        return taskCount;
    }

    public String getName() {
        return name;
    }
}
