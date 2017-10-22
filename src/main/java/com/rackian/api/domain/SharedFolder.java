package com.rackian.api.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shared_folders")
public class SharedFolder implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @Column(name = "link", nullable = false)
    private String link;

    @ManyToOne
    @JoinColumn(name = "folder")
    private Folder folder;

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

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
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
