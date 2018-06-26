package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TasksQueue jacekTasks = new TasksQueue("Jacek Krygier");
        TasksQueue amadeuszTasks = new TasksQueue("Amadeusz Furman");
        TasksQueue robertTasks = new TasksQueue("Robert Lewandowski");
        TasksQueue thiagoTasks = new TasksQueue("Thiago Cionek");
        TasksQueue grzegorzTasks = new TasksQueue("Grzegorz Krychowiak");

        Mentor pawel = new Mentor("Paweł Paskudzki");
        Mentor adam = new Mentor("Adam Nawałka");

        jacekTasks.registerObserver(pawel);
        amadeuszTasks.registerObserver(pawel);
        robertTasks.registerObserver(adam);
        thiagoTasks.registerObserver(adam);
        grzegorzTasks.registerObserver(adam);

        //When
        jacekTasks.addTask("Sudoku");
        jacekTasks.addTask("Adapter");
        amadeuszTasks.addTask("REST Api");
        robertTasks.addTask("Score goal!");
        robertTasks.addTask("Be a captain");
        thiagoTasks.addTask("Get out of my sight");
        grzegorzTasks.addTask("Play football");
        grzegorzTasks.addTask("No more selfie");

        //Then
        assertEquals(3, pawel.getUpdateCount());
        assertEquals(5, adam.getUpdateCount());
    }
}
