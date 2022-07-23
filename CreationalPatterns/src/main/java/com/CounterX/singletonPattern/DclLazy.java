package com.CounterX.singletonPattern;

public class DclLazy {

    private static DclLazy lazy;

    private DclLazy() {}

    public static DclLazy getLazy() {
        if (lazy == null) lazy = new DclLazy();
        return lazy;
    }
}
