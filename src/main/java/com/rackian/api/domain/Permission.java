package com.rackian.api.domain;

import javax.persistence.*;

@Entity
@Table(name = "permissions")
public class Permission {

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
