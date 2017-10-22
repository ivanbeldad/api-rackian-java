package com.rackian.api.domain;

public class SharedFolder {

    private long id;
    private Folder folder;
    private SharedPermission sharedPermission;
    private String link;

    public long getId() {
        return id;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public SharedPermission getSharedPermission() {
        return sharedPermission;
    }

    public void setSharedPermission(SharedPermission sharedPermission) {
        this.sharedPermission = sharedPermission;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
