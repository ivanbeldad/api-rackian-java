package com.rackian.api.domain;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PermissionSpec {

    private Permission permission;

    @Before
    public void setUp() throws Exception {
        permission = new Permission();
    }

    @Test
    public void whenSetNameThenNameChange() throws Exception {
        permission.setType(PermissionType.READ);
        assertThat(permission.getType(), is(PermissionType.READ));
    }

    @Test
    public void whenSetTimeStampsThenTimeStampsChange() throws Exception {
        TimeStamps timeStamps = new TimeStamps();
        permission.setTimeStamps(timeStamps);
        assertThat(permission.getTimeStamps(), CoreMatchers.is(timeStamps));
    }

}
