package com.CounterX.adapterPattern;

import java.util.concurrent.Callable;

public class MyCallableAdapter {

    public static <V> Callable<V> adapt(Runnable task, V result) {
        return new Callable<V>() {
            @Override
            public V call() throws Exception {
                System.out.println("[" + Thread.currentThread() + "] Adapter call");
                task.run();
                return result;
            }
        };
    }
}
