package com.rackian.api.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SharedFileSpec {

    private SharedFile sharedFile;

    @Before
    public void setUp() throws Exception {
        sharedFile = new SharedFile();
    }

    @Test
    public void whenSetLinkThenLinkChange() throws Exception {
        sharedFile.setLink("https://example.com");
        assertThat(sharedFile.getLink(), is("https://example.com"));
    }

    @Test
    public void whenSetFolderThenFolderChange() throws Exception {
        File file = new File();
        sharedFile.setFile(file);
        assertThat(sharedFile.getFile(), is(file));
    }

    @Test
    public void whenSetSharedPermissionThenSharedPermissionChange() throws Exception {
        Permission permission = new Permission();
        sharedFile.setPermission(permission);
        assertThat(sharedFile.getPermission(), is(permission));
    }

    @Test
    public void whenSetTimeStampsThenTimeStampsChange() throws Exception {
        TimeStamps timeStamps = new TimeStamps();
        sharedFile.setTimeStamps(timeStamps);
        assertThat(sharedFile.getTimeStamps(), is(timeStamps));
    }

}
