package com.nisbeterik.flashx.utils;

public class StringUtils {

    private StringUtils() {
        // private constructor to prevent instantiation
    }

    public static void validateString(String value, String errorMessage) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}