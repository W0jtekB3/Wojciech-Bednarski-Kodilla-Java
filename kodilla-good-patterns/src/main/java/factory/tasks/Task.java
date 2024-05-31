package factory.tasks;

public interface Task {
    void executeTask();
    String getTaskName();
    boolean isTaskExecuted();
}
