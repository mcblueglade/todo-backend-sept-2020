package com.techreturners.model;

public class Task {

    private String taskId;
    private String taskDescription;
    private boolean completed;

    public Task(String taskId, String taskDescription, boolean completed) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.completed = completed;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean isCompleted() {
        return completed;
    }
}
