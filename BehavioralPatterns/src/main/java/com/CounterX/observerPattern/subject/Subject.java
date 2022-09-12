package com.CounterX.observerPattern.subject;

import com.CounterX.observerPattern.event.EventChannel;

public interface Subject {
    void setChannel(EventChannel channel);
    void test(String s);
}
