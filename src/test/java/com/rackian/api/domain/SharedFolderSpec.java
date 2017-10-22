package com.rackian.api.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SharedFolderSpec {

    private SharedFolder sharedFolder;

    @Before
    public void setUp() throws Exception {
        sharedFolder = new SharedFolder();
    }

    @Test
    public void whenSetFolderThenFolderChange() throws Exception {
        Folder folder = new Folder();
        sharedFolder.setFolder(folder);
        assertThat(sharedFolder.getFolder(), is(folder));
    }

    @Test
    public void whenSetSharedPermissionThenSharedPermissionChange() throws Exception {
        SharedPermission sharedPermission = new SharedPermission();
        sharedFolder.setSharedPermission(sharedPermission);
        assertThat(sharedFolder.getSharedPermission(), is(sharedPermission));
    }

    @Test
    public void whenSetLinkThenLinkChange() throws Exception {
        sharedFolder.setLink("https://example.com");
        assertThat(sharedFolder.getLink(), is("https://example.com"));
    }

}
