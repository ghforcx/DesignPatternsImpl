package com.CounterX.proxyPattern.staticProxy;

public class DogNameProxy implements Dog {

    private final Dog dog = new DogImpl();

    @Override
    public String getName() {
        return dog.getName();
    }

    @Override
    public void setName(String name) {
        dog.setName(name);
    }

    @Override
    public int bark() {
        if (dog.getName() == null) {
            System.out.println("This dog has not been named yet!");
            return -1;
        } else {
            return dog.bark();
        }
    }
}
