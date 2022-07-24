package com.CounterX.singletonPattern;

import java.io.Serializable;

public class Hungry implements Serializable {

    private static final Hungry instance = new Hungry();

    private Hungry() {};

    public static Hungry getInstance() {
        return instance;
    }
}
