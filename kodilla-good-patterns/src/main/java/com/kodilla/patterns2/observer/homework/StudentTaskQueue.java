package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTaskQueue implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private final List<String> tasks = new ArrayList<>();
    private final String studentName;

    public StudentTaskQueue(String studentName) {
        this.studentName = studentName;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public void addObserver(com.kodilla.patterns2.observer.forum.Observer observer) {

    }

    @Override
    public void removeObserver(com.kodilla.patterns2.observer.forum.Observer observer) {

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getStudentName() {
        return studentName;
    }
}
