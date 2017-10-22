package com.rackian.api.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FolderSpec {

    private Folder folder;

    @Before
    public void setUp() throws Exception {
        folder = new Folder();
    }

    @Test
    public void whenSetNameThenNameChange() throws Exception {
        folder.setName("New name");
        assertThat(folder.getName(), is("New name"));
    }

    @Test
    public void whenSetDescriptionThenDescriptionChange() throws Exception {
        folder.setDescription("New description");
        assertThat(folder.getDescription(), is("New description"));
    }

    @Test
    public void whenSetUserThenUserChange() throws Exception {
        User user = new User();
        folder.setUser(user);
        assertThat(folder.getUser(), is(user));
    }

    @Test
    public void whenSetParentFolderThenParentFolderChange() throws Exception {
        Folder parentFolder = new Folder();
        folder.setParentFolder(parentFolder);
        assertThat(folder.getParentFolder(), is(parentFolder));
    }

    @Test
    public void whenSetFoldersThenFoldersChange() throws Exception {
        Set<Folder> folders = new HashSet<>();
        folder.setFolders(folders);
        assertThat(folder.getFolders(), is(folders));
    }

    @Test
    public void whenSetFilesThenFilesChange() throws Exception {
        Set<File> files = new HashSet<>();
        folder.setFiles(files);
        assertThat(folder.getFiles(), is(files));
    }

    @Test
    public void whenSetTimeStampsThenTimeStampsChange() throws Exception {
        TimeStamps timeStamps = new TimeStamps();
        folder.setTimeStamps(timeStamps);
        assertThat(folder.getTimeStamps(), is(timeStamps));
    }

}
