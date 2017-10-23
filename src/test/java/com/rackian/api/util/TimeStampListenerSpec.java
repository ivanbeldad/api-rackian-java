package com.rackian.api.util;

import com.rackian.api.domain.TimeStamped;
import com.rackian.api.domain.User;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNull.notNullValue;

public class TimeStampListenerSpec {

    private TimeStampListener timeStampListener;

    @Before
    public void setUp() throws Exception {
        timeStampListener = new TimeStampListener();
    }

    @Test
    public void givenTimeStampedWhenOnCreateThenCreateIsNotNull() throws Exception {
        TimeStamped timeStamped = new User();
        timeStampListener.prePersist(timeStamped);
        assertThat(timeStamped.getTimeStamps().getCreated(), notNullValue());
    }

    @Test
    public void givenTimeStampedWhenOnCreateThenUpdateIsNotNull() throws Exception {
        TimeStamped timeStamped = new User();
        timeStampListener.prePersist(timeStamped);
        assertThat(timeStamped.getTimeStamps().getUpdated(), notNullValue());
    }

    @Test
    public void givenTimeStampedWhenOnUpdateThenUpdateIsNotNull() throws Exception {
        TimeStamped timeStamped = new User();
        timeStampListener.preUpdate(timeStamped);
        assertThat(timeStamped.getTimeStamps().getUpdated(), notNullValue());
    }

}
