package com.rackian.api.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SharedPermissionSpec {

    private SharedPermission sharePermission;

    @Before
    public void setUp() throws Exception {
        sharePermission = new SharedPermission();
    }

    @Test
    public void whenSetNameThenNameChange() throws Exception {
        sharePermission.setType(PermissionType.READ);
        assertThat(sharePermission.getType(), is(PermissionType.READ));
    }

}
