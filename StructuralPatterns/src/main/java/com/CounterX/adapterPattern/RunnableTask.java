package com.CounterX.adapterPattern;

public class RunnableTask implements Runnable{
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread() + "] run");
    }
}
