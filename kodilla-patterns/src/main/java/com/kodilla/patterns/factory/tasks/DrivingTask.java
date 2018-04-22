package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    boolean isExecuted;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        isExecuted = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }


    @Override
    public void executeTask() {
        System.out.println(taskName + ":\nGoing to " + where + " by " + using);
        isExecuted = true;
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

