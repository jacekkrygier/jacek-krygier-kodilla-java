package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable {
    private Observer observer;
    private final ArrayDeque<String> tasks;
    private final String student;

    public TasksQueue(String student) {
        tasks = new ArrayDeque<>();
        this.student = student;
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObserver() {
            observer.update(this);
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }

    public String getStudent() {
        return student;
    }
}
