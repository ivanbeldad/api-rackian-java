package com.rackian.api.util;

import com.rackian.api.domain.TimeStamped;
import com.rackian.api.domain.TimeStamps;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class TimeStampListener {

    @PrePersist
    public void prePersist(Object entity) {
        if (!(entity instanceof TimeStamped)) return;
        TimeStamped timeStamped = (TimeStamped) entity;
        if (timeStamped.getTimeStamps() == null) timeStamped.setTimeStamps(new TimeStamps());

        Date now = new Date();
        timeStamped.getTimeStamps().setCreated(now);
        timeStamped.getTimeStamps().setUpdated(now);
    }

    @PreUpdate
    public void preUpdate(Object entity) {
        if (!(entity instanceof TimeStamped)) return;
        TimeStamped timeStamped = (TimeStamped) entity;
        if (timeStamped.getTimeStamps() == null) timeStamped.setTimeStamps(new TimeStamps());

        Date now = new Date();
        timeStamped.getTimeStamps().setUpdated(now);
    }

}
