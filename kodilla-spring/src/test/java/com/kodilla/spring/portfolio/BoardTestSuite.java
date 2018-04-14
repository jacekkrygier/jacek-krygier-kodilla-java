package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "Washing teeth.";
        String taskInProgress = "Eating.";
        String taskDone = "Waking up.";
        board.toDoList.tasks.add(taskToDo);
        board.inProgressList.tasks.add(taskInProgress);
        board.doneList.tasks.add(taskDone);

        //Then
        Assert.assertEquals("Washing teeth.", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Eating.", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Waking up.", board.getDoneList().getTasks().get(0));
    }
}
