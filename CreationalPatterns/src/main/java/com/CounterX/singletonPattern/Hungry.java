package com.CounterX.singletonPattern;

public class Hungry {

    private static final Hungry hungry = new Hungry();

    private Hungry() {};

    public static Hungry getHungry() {
        return hungry;
    }
}
