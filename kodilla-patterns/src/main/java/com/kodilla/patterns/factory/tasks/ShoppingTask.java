package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean isExecuted;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        isExecuted = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }


    @Override
    public void executeTask() {
        System.out.println(taskName + ":\nBuying " + whatToBuy + " in quantity of: " + quantity);
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