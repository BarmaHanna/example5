package com.company;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[10];
        System.out.println("Source words");
        for (int i=0; i < 10; i++) {
            words[i] = RandomStringUtils.randomAlphabetic(10);
            System.out.println(words[i]);
        }
        System.out.println("Transformed words");
        for (int i=0; i< 10; i++) {
            System.out.println(StringUtils.capitalize(words[i].toLowerCase()));
        }
    }
}
