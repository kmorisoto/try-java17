package com.example.recods;

import java.util.Locale;

public record User(String name, int age) {


    public String foo() {
        return name.toUpperCase(Locale.ROOT);
    }
}
