package com.rackian.api.domain;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Embeddable
public class TimeStamps {

    @Column(name = "created")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date created;

    @Column(name = "updated")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updated;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @PrePersist
    protected void onCreate() {
        created = Date.from(Instant.now());
    }

    @PreUpdate
    protected void onUpdate() {
        updated = Date.from(Instant.now());
    }

}
