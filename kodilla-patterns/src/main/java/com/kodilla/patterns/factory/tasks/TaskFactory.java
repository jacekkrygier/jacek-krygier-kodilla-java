package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Driving", "cinema", "car");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping", "laptop", 1.0);
            case PAINTINGTASK:
                return new PaintingTask("Painting", "green", "Peak District mountain");
            default:
                return null;
        }
    }
}