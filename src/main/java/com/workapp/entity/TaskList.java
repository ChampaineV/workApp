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

    /**
     * Instantiates a new TaskList
     */
    public TaskList() {
    }

    /**
     * Instantiates a new TaskList
     *
     * @param taskListId task list id
     * @param taskListName task list name
     * @param taskListDescription task list description
     * @param folderId folder id
     * @param isCompleted task list status
     * @param dateCreated task list's date created
     */
    public TaskList(int taskListId, String taskListName, String taskListDescription, int folderId, boolean isCompleted, String dateCreated) {
        this.taskListId = taskListId;
        this.taskListName = taskListName;
        this.taskListDescription = taskListDescription;
        this.folderId = folderId;
        this.isCompleted = isCompleted;
        this.dateCreated = dateCreated;
    }

    /**
     * Gets task list id
     *
     * @return task list id
     */
    public int getTaskListId() {
        return taskListId;
    }

    /**
     * Sets task list id
     * @param taskListId task list id
     */
    public void setTaskListId(int taskListId) {
        this.taskListId = taskListId;
    }

    /**
     * Gets the name of the task list
     * @return name of the task list
     */
    public String getTaskListName() {
        return taskListName;
    }

    /**
     * Sets the name of the task list
     * @param taskListName name of the task list
     */
    public void setTaskListName(String taskListName) {
        this.taskListName = taskListName;
    }

    /**
     * Gets the description of the task list
     * @return the description of the task list
     */
    public String getTaskListDescription() {
        return taskListDescription;
    }

    /**
     * Sets the description of the task list
     * @param taskListDescription the description of the task list
     */
    public void setTaskListDescription(String taskListDescription) {
        this.taskListDescription = taskListDescription;
    }

    /**
     * Gets the folder id
     * @return folder id
     */
    public int getFolderId() {
        return folderId;
    }

    /**
     * Sets the folder id
     * @param folderId the folder id
     */
    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    /**
     * Gets the status of the task list.
     * @return the status of the task list
     */
    public boolean isCompleted() {
        return isCompleted;
    }

    /**
     * Sets the task list's status to completed or not
     * @param completed the task list's status
     */
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    /**
     * Gets the date the task list was created
     * @return the date the task list was created
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the date the task list was created
     * @param dateCreated the date the task list was created
     */
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
