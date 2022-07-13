package com.CounterX.proxyPattern.dynamicProxy.pojo;

public class Dog implements Animal{
    @Override
    public void call() {
        System.out.println("woof~");
    }
}
