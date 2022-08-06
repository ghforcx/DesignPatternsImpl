package com.CounterX.adapterPattern;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("[" + Thread.currentThread() + "] call");
        return "success";
    }
}
