package com.workapp.entity;

/**
 * A class representing a task list.
 *
 * @author lvang
 */
public class TaskList {
    private int taskListId;
    private String taskListName;
    private String taskListDescription;
    private int folderId;
    private boolean isCompleted;
    private String dateCreated;


    public int getTaskListId() {
        return taskListId;
    }

    public void setTaskListId(int taskListId) {
        this.taskListId = taskListId;
    }

    public String getTaskListName() {
        return taskListName;
    }

    public void setTaskListName(String taskListName) {
        this.taskListName = taskListName;
    }

    public String getTaskListDescription() {
        return taskListDescription;
    }

    public void setTaskListDescription(String taskListDescription) {
        this.taskListDescription = taskListDescription;
    }

    public int getFolderId() {
        return folderId;
    }

    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "taskListId=" + taskListId +
                ", taskListName='" + taskListName + '\'' +
                ", taskListDescription='" + taskListDescription + '\'' +
                ", folderId=" + folderId +
                ", isCompleted=" + isCompleted +
                ", dateCreated='" + dateCreated + '\'' +
                '}';
    }
}
