package com.rackian.api.domain;

import org.junit.Before;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserSpec {

    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void whenSetEmailThenEmailChange() throws Exception {
        user.setEmail("email@domain.com");
        assertThat(user.getEmail(), is("email@domain.com"));
    }

    @Test
    public void whenSetNameThenNameChange() throws Exception {
        user.setUsername("myname");
        assertThat(user.getUsername(), is("myname"));
    }

    @Test
    public void whenSetDescriptionThenDescriptionChange() throws Exception {
        user.setPassword("mypassword");
        assertThat(user.getPassword(), is("mypassword"));
    }

    @Test
    public void whenSetLastLoginThenLastLoginChange() throws Exception {
        ZonedDateTime lastLogin = ZonedDateTime.of(2020, 1, 1, 0, 0, 0, 0, ZoneId.of("UTC"));
        user.setLastLogin(lastLogin);
        assertThat(user.getLastLogin(), is(lastLogin));
    }

    @Test
    public void whenSetJoinedThenJoinedChange() throws Exception {
        ZonedDateTime joined = ZonedDateTime.of(2020, 1, 1, 0, 0, 0, 0, ZoneId.of("UTC"));
        user.setJoined(joined);
        assertThat(user.getJoined(), is(joined));
    }

    @Test
    public void whenSetIsActiveThenIsActiveChange() throws Exception {
        user.setActive(true);
        assertThat(user.isActive(), is(true));
    }

    @Test
    public void whenSetSpaceThenSpaceChange() throws Exception {
        user.setSpace(1000L);
        assertThat(user.getSpace(), is(1000L));
    }

}
