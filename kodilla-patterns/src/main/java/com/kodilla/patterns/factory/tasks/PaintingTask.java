package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        isExecuted = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void executeTask() {
        System.out.println(taskName + ":\nPainting " + whatToPaint + " in color " + color);
        isExecuted = true;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
    @Override
    public boolean isTaskExecuted() {
        if (isExecuted) {
            return true;
        } else {
            return false;
        }
    }
}