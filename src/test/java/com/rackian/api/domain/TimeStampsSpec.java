package com.rackian.api.domain;

import org.junit.Before;
import org.junit.Test;

import java.time.Instant;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class TimeStampsSpec {

    private TimeStamps timeStamps;

    @Before
    public void setUp() throws Exception {
        timeStamps = new TimeStamps();
    }

    @Test
    public void whenSetCreatedThenCreatedChange() throws Exception {
        Date created = Date.from(Instant.now());
        timeStamps.setCreated(created);
        assertThat(timeStamps.getCreated(), is(created));
    }

    @Test
    public void whenSetUpdatedThenUpdatedChange() throws Exception {
        Date updated = Date.from(Instant.now());
        timeStamps.setUpdated(updated);
        assertThat(timeStamps.getUpdated(), is(updated));
    }

    @Test
    public void whenOnCreateThenCreateIsNotNull() throws Exception {
        timeStamps.onCreate();
        assertThat(timeStamps.getCreated(), notNullValue());
    }

    @Test
    public void whenOnUpdateThenUpdateIsNotNull() throws Exception {
        timeStamps.onUpdate();
        assertThat(timeStamps.getUpdated(), notNullValue());
    }

}
