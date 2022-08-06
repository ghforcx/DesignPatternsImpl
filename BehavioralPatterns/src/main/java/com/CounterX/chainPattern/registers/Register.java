package com.CounterX.chainPattern.registers;

import com.CounterX.chainPattern.Processor;

import java.util.ListIterator;

public interface Register {
    void regist(Processor processor);
    ListIterator<Processor> getIterator();
}
