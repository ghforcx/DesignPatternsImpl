package com.CounterX.proxyPattern.staticProxy;

public class Main {
    public static void main(String[] args) {

        // 静态代理模式
        Dog dog = new DogProxy();
        dog.setName("金毛");
        dog.bark();

    }
}