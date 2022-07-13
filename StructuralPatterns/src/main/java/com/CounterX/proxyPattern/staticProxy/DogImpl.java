package com.CounterX.proxyPattern.staticProxy;

public class DogImpl implements Dog {
    private String name;

    public DogImpl(){}

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int bark() {
        System.out.println(name + " bark: Woof~");
        return 0;
    }
}
