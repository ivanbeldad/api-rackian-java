package com.rackian.api.domain;

import javax.persistence.*;

@Entity
@Table(name = "shared_files")
public class SharedFile {

    @Id
    private long id;

    @Column(name = "link", nullable = false)
    private String link;

    @ManyToOne
    @JoinColumn(name = "file")
    private File file;

    @ManyToOne
    @JoinColumn(name = "permission")
    private Permission permission;

    @Embedded
    private TimeStamps timeStamps;

    public long getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }

}
