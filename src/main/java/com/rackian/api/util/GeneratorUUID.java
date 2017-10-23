package com.rackian.api.util;

public interface GeneratorUUID {

    String generateUUID();

    String generateChildUUID(String parentUUID);

}
