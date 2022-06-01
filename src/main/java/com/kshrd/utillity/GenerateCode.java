package com.kshrd.utillity;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class  GenerateCode {

    private final Random RANDOM = new SecureRandom();
    private final String ALPHABET = "QWERTYUIOPasdfghjkl1234567890ZXCVBNM";
    //Id should not have "!@#$%^&*";

    private String generateRandomString(int length){
        StringBuilder value = new StringBuilder(length);
        for(int i=0; i<length; i++){
            value.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return new String(value);
    }
    public String generateUserId(int length){
        return generateRandomString(length);
    }
}
