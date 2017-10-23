package com.rackian.api.domain;

import com.rackian.api.util.GeneratorUUID;
import com.rackian.api.util.GeneratorUUIDImpl;
import com.rackian.api.util.TimeStampListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "files")
@EntityListeners(TimeStampListener.class)
public class File implements Serializable, TimeStamped {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "size", nullable = false)
    private long size;

    @Column(name = "mime_type", nullable = false)
    private String mimeType;

    @Column(name = "extension", nullable = false)
    private String extension;

    @Column(name = "location", nullable = false)
    private String location;

    @ManyToOne
    @JoinColumn(name = "folder")
    private Folder folder;

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

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }

    @PrePersist
    public void prePersist() {
        GeneratorUUID generatorUUID = new GeneratorUUIDImpl();
        id = generatorUUID.generateChildUUID(folder.getUser().getId());
    }

}
