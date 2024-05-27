package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy groceries", "Apples", 5.0);
            case PAINTING:
                return new PaintingTask("Paint wall", "Blue", "Living Room Wall");
            case DRIVING:
                return new DrivingTask("Drive to work", "Office", "Car");
            default:
                return null;
        }
    }
}
