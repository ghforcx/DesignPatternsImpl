package com.CounterX.singletonPattern;

import java.io.Serializable;

public class DclLazy implements Serializable {

    private static volatile DclLazy instance;


    private DclLazy() {}

    public static DclLazy getInstance() {
        DclLazy localRef = instance;
        while (localRef == null) {
            synchronized (DclLazy.class) {
                localRef = instance;
                if (localRef == null) {
                    localRef = instance = new DclLazy();
                }
            }
        }
        return localRef;
    }
}
