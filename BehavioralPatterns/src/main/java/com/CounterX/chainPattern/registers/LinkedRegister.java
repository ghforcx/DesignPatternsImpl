package com.CounterX.chainPattern.registers;

import com.CounterX.chainPattern.Processor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedRegister implements Register {
    private final LinkedList<Processor> registry = new LinkedList<>();

    @Override
    public void regist(Processor processor) {
        registry.add(processor);
    }

    @Override
    public ListIterator<Processor> getIterator() {
        return registry.listIterator();
    }
}
