package com.rackian.api.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "folders")
public class Folder implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "parent_folder")
    private Folder parentFolder;

    @OneToMany(mappedBy = "parentFolder")
    private Set<Folder> folders = new HashSet<>();

    @OneToMany(mappedBy = "folder")
    private Set<File> files = new HashSet<>();

    @Embedded
    private TimeStamps timeStamps;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Folder getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(Folder parentFolder) {
        this.parentFolder = parentFolder;
    }

    public Set<Folder> getFolders() {
        return folders;
    }

    public void setFolders(Set<Folder> folders) {
        this.folders = folders;
    }

    public Set<File> getFiles() {
        return files;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }

}
