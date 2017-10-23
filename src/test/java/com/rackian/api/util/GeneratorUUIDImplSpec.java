package com.rackian.api.util;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratorUUIDImplSpec {

    private GeneratorUUID generatorUUID;

    @Before
    public void setUp() throws Exception {
        generatorUUID = new GeneratorUUIDImpl();
    }

    @Test
    public void whenGenerateUUIDThenRandomUUIDIsReturned() throws Exception {
        assertThat(generatorUUID.generateUUID(), notNullValue());
    }

    @Test
    public void whenGenerateUUIDThenStringHaveEightCharacters() throws Exception {
        assertThat(generatorUUID.generateUUID().length(), is(8));
    }

    @Test
    public void whenGenerateUUIDMultipleTimesThenTheyDontMatch() throws Exception {
        String uuid1 = generatorUUID.generateUUID();
        String uuid2 = generatorUUID.generateUUID();
        String uuid3 = generatorUUID.generateUUID();
        String uuid4 = generatorUUID.generateUUID();
        assertThat(uuid1, not(uuid2));
        assertThat(uuid1, not(uuid3));
        assertThat(uuid1, not(uuid4));
        assertThat(uuid2, not(uuid3));
        assertThat(uuid2, not(uuid4));
        assertThat(uuid3, not(uuid4));
    }

    @Test
    public void whenGenerateChildUUIDThenRandomUUIDIsReturned() throws Exception {
        assertThat(generatorUUID.generateChildUUID(""), notNullValue());
    }

    @Test
    public void whenGenerateChildUUIDThenStringHaveNineCharactersMoreThanParent() throws Exception {
        assertThat(generatorUUID.generateChildUUID("1234").length(), is(13));
    }

    @Test
    public void whenGenerateChildUUIDThenParentIsConcatenatedWithDashToChild() throws Exception {
        String parent = "parent";
        assertThat(generatorUUID.generateChildUUID(parent), containsString(parent + "-"));
    }

    @Test
    public void whenGenerateChildUUIDMultipleTimesThenTheyDontMatch() throws Exception {
        String uuid1 = generatorUUID.generateChildUUID("12341234");
        String uuid2 = generatorUUID.generateChildUUID("12341234");
        String uuid3 = generatorUUID.generateChildUUID("12341234");
        String uuid4 = generatorUUID.generateChildUUID("12341234");
        assertThat(uuid1, not(uuid2));
        assertThat(uuid1, not(uuid3));
        assertThat(uuid1, not(uuid4));
        assertThat(uuid2, not(uuid3));
        assertThat(uuid2, not(uuid4));
        assertThat(uuid3, not(uuid4));
    }

}
