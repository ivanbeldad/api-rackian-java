package com.rackian.api.util;

import java.util.Random;

public class GeneratorUUIDImpl implements GeneratorUUID {

    @Override
    public String generateUUID() {
        return randomCharacters(8);
    }

    @Override
    public String generateChildUUID(String parentUUID) {
        return parentUUID + "-" + randomCharacters(8);
    }

    private String randomCharacters(int length) {
        String salt = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        for(int i = 0; i < length; i++) {
            int randomPosition = (int) (rnd.nextFloat() * salt.length());
            result.append(salt.charAt(randomPosition));
        }
        return result.toString();
    }

}
