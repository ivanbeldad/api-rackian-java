package com.rackian.api.domain;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FileSpec {

    private File file;

    @Before
    public void setUp() throws Exception {
        file = new File();
    }

    @Test
    public void whenSetNameThenNameChange() throws Exception {
        file.setName("New name");
        assertThat(file.getName(), is("New name"));
    }

    @Test
    public void whenSetDescriptionThenDescriptionChange() throws Exception {
        file.setDescription("New description");
        assertThat(file.getDescription(), is("New description"));
    }

    @Test
    public void whenSetSizeThenSizeChange() throws Exception {
        file.setSize(1234L);
        assertThat(file.getSize(), is(1234L));
    }

    @Test
    public void whenSetMimeTypeThenMimeTypeChange() throws Exception {
        file.setMimeType("json/application");
        assertThat(file.getMimeType(), is("json/application"));
    }

    @Test
    public void whenSetExtensionThenExtensionChange() throws Exception {
        file.setExtension(".jpg");
        assertThat(file.getExtension(), is(".jpg"));
    }

    @Test
    public void whenSetLocationThenLocationChange() throws Exception {
        file.setLocation("/folder/subfolder");
        assertThat(file.getLocation(), is("/folder/subfolder"));
    }

    @Test
    public void whenSetFolderThenFolderChange() throws Exception {
        Folder parentFolder = new Folder();
        file.setFolder(parentFolder);
        assertThat(file.getFolder(), is(parentFolder));
    }

    @Test
    public void whenSetTimeStampsThenTimeStampsChange() throws Exception {
        TimeStamps timeStamps = new TimeStamps();
        file.setTimeStamps(timeStamps);
        assertThat(file.getTimeStamps(), is(timeStamps));
    }

}
