package com.workapp.entity;

public class Task {
    private int taskId;
    private String taskName;
    private boolean isCompleted;
    private int taskListId;
    private String taskDueDate;

    /**
     * Instantiates a new Task.
     */
    public Task() {
    }

    /**
     * Instantiates a new Task
     *
     * @param taskId the task id
     * @param taskName the task name
     * @param isCompleted the status of task
     * @param taskListId the task list id
     * @param taskDueDate the due date of the task
     */
    public Task(int taskId, String taskName, boolean isCompleted, int taskListId, String taskDueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.isCompleted = isCompleted;
        this.taskListId = taskListId;
        this.taskDueDate = taskDueDate;
    }

    /**
     * Get the task id.
     * @return the task's id
     */
    public int getTaskId() {
        return taskId;
    }

    /**
     * Sets the task id.
     * @param taskId the task's id
     */
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    /**
     * Gets the task's name
     * @return the task's name
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets the task's name
     * @param taskName the task's name
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * Gets the status of the task.
     * @return the status of the task
     */
    public boolean isCompleted() {
        return isCompleted;
    }

    /**
     * Sets the task's status to completed or not
     * @param completed the task's status
     */
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    /**
     * Gets the task list id
     * @return the task list id
     */
    public int getTaskListId() {
        return taskListId;
    }

    /**
     * Sets the task list id
     * @param taskListId the task list id
     */
    public void setTaskListId(int taskListId) {
        this.taskListId = taskListId;
    }

    /**
     * Gets the due date of the task
     * @return task's due date
     */
    public String getTaskDueDate() {
        return taskDueDate;
    }

    /**
     * Sets the due date of the task
     * @param taskDueDate task's due date
     */
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
