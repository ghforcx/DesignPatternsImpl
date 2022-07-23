package com.CounterX.singletonPattern;

import java.io.Serializable;

public class Lazy implements Serializable {

    private static Lazy instance;

    private Lazy() {}

    public static Lazy getInstance() {
        if (instance == null) instance = new Lazy();
        return instance;
    }

}
