package com.CounterX.proxyPattern.dynamicProxy.pojo;

public class Cat implements Animal{
    @Override
    public void call() {
        System.out.println("meow~");
    }
}
