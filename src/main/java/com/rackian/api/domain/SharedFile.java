package com.rackian.api.domain;

public class SharedFile {

    private long id;
    private File file;
    private SharedPermission sharedPermission;
    private String link;

    public long getId() {
        return id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
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
