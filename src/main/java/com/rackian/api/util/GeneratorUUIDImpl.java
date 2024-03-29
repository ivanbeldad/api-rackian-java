package com.rackian.api.util;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component(value = "generatorUUID")
public class GeneratorUUIDImpl implements GeneratorUUID {

    private final int LENGTH = 12;

    @Override
    public String generateUUID() {
        return randomCharacters(LENGTH);
    }

    @Override
    public String generateChildUUID(String parentUUID) {
        return parentUUID + "-" + randomCharacters(LENGTH);
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
