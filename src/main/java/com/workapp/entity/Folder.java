package com.workapp.entity;

/**
 * This class represents a folder
 *
 * @author lvang
 */
public class Folder {
    private int folderId;
    private String folderName;

    /**
     * Instantiates a new Folder
     */
    public Folder() {
    }

    /**
     * Instanstiates a new Folder
     * @param folderId the folder's id
     * @param folderName the folder's name
     */
    public Folder(int folderId, String folderName) {
        this.folderId = folderId;
        this.folderName = folderName;
    }

    /**
     * Gets folder id
     * @return folder id
     */
    public int getFolderId() {
        return folderId;
    }

    /**
     * Sets folder id
     * @param folderId the folder's id
     */
    public void setFolderId(int folderId) {
        this.folderId = folderId;
    }

    /**
     * Gets the folder's name
     * @return the folder's name
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * Sets the folder's name
     * @param folderName the folder's name
     */
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "folderId=" + folderId +
                ", folderName='" + folderName + '\'' +
                '}';
    }
}
