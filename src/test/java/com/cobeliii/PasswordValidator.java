package com.cobeliii;

import java.util.function.Predicate;

public class PasswordValidator implements Predicate<String> {
    private static final Integer MIN_CHAR_VALUES = 8;

    @Override
    public boolean test(String password) {
        if (password == null || password.trim().isBlank()) {return false;}

        password = password.trim();

        if (password.length() < MIN_CHAR_VALUES) {return false;}

        return true;
    }
}
