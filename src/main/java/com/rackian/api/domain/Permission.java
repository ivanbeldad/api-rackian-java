package com.rackian.api.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "permissions")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private PermissionType type;

    @Embedded
    private TimeStamps timeStamps;

    public long getId() {
        return id;
    }

    public PermissionType getType() {
        return type;
    }

    public void setType(PermissionType type) {
        this.type = type;
    }

    public TimeStamps getTimeStamps() {
        return timeStamps;
    }

    public void setTimeStamps(TimeStamps timeStamps) {
        this.timeStamps = timeStamps;
    }

}
