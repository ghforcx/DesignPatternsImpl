package com.CounterX.observerPattern.subject;

import com.CounterX.observerPattern.event.Event;
import com.CounterX.observerPattern.event.EventChannel;

public class SubjectImpl implements Subject{
    private EventChannel channel;

    @Override
    public void setChannel(EventChannel channel) {
        this.channel = channel;
    }

    @Override
    public void test(String s) {
        // do something
        channel.onEvent(new Event(s));
    }
}
