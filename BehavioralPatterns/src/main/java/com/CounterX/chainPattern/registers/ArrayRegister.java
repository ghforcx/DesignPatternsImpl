package com.CounterX.chainPattern.registers;

import com.CounterX.chainPattern.Processor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayRegister implements Register {
    private final ArrayList<Processor> registry = new ArrayList<>();

    @Override
    public void regist(Processor processor) {
        registry.add(processor);
    }

    @Override
    public ListIterator<Processor> getIterator() {
        return registry.listIterator();
    }
}
