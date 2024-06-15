package com.kodilla.hibernate.task;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "duration")
    private int duration;

    public Task() {
    }

    public Task(String description, int duration) {
        this.description = description;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
}