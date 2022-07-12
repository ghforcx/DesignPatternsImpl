package com.CounterX;

import com.CounterX.proxyPattern.staticProxy.Dog;
import com.CounterX.proxyPattern.staticProxy.DogProxy;

public class Main {
    public static void main(String[] args) {

        Dog dog = new DogProxy();
        dog.setName("金毛");
        dog.bark();
    }
}