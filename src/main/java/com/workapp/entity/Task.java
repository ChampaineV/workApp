package com.workapp.entity;

public class Task {
    private int taskId;
    private String taskName;
    private boolean isCompleted;
    private int taskListId;
    private String taskDueDate;


    public Task() {
    }

    public Task(int taskId, String taskName, boolean isCompleted, int taskListId, String taskDueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.isCompleted = isCompleted;
        this.taskListId = taskListId;
        this.taskDueDate = taskDueDate;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public int getTaskListId() {
        return taskListId;
    }

    public void setTaskListId(int taskListId) {
        this.taskListId = taskListId;
    }

    public String getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(String taskDueDate) {
        this.taskDueDate = taskDueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", isCompleted=" + isCompleted +
                ", taskListId=" + taskListId +
                ", taskDueDate='" + taskDueDate + '\'' +
                '}';
    }
}
