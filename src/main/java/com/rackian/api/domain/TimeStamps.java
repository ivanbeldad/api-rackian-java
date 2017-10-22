package com.rackian.api.domain;

import java.time.ZonedDateTime;

public class TimeStamps {

    private ZonedDateTime created;
    private ZonedDateTime updated;

    public ZonedDateTime getCreated() {
        return created;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }

    public ZonedDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(ZonedDateTime updated) {
        this.updated = updated;
    }

}
