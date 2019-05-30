package com.springhibernate.demo.persistence.util;

import java.util.UUID;

public class UUIDGenerator {
    public static String generateDefault(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
