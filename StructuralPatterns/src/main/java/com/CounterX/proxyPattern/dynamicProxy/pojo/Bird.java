package com.CounterX.proxyPattern.dynamicProxy.pojo;

public class Bird implements Animal{
    @Override
    public void call() {
        System.out.println("tweet~");
    }
}
