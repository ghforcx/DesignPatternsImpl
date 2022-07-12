package com.CounterX.proxyPattern.staticProxy;

public class DogLogProxy implements Dog {

    private final Dog dog = new DogNameProxy();
    @Override
    public String getName() {
        System.out.println("Query the name of the dog");
        return dog.getName();
    }

    @Override
    public void setName(String name) {
        System.out.println("Naming the dog");
        dog.setName(name);
    }

    @Override
    public int bark() {
        System.out.println("Dog is barking");
        return dog.bark();
    }
}
