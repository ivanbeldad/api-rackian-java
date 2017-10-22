package com.rackian.api.domain;

import org.junit.Before;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TimeStampsSpec {

    private TimeStamps timeStamps;

    @Before
    public void setUp() throws Exception {
        timeStamps = new TimeStamps();
    }

    @Test
    public void whenSetCreatedThenCreatedChange() throws Exception {
        ZonedDateTime created = ZonedDateTime.of(2020, 1, 1, 0, 0, 0, 0, ZoneId.of("UTC"));
        timeStamps.setCreated(created);
        assertThat(timeStamps.getCreated(), is(created));
    }

    @Test
    public void whenSetUpdatedThenUpdatedChange() throws Exception {
        ZonedDateTime updated = ZonedDateTime.of(2020, 1, 1, 0, 0, 0, 0, ZoneId.of("UTC"));
        timeStamps.setUpdated(updated);
        assertThat(timeStamps.getUpdated(), is(updated));
    }

}
