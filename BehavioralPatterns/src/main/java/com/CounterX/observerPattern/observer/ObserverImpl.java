package com.CounterX.observerPattern.observer;

import com.CounterX.observerPattern.event.Event;

public class ObserverImpl implements Observer {

    private final String name;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void onEvent(Event event) {
        System.out.println("[Observer " + name + "][recive]" + event);
    }
}
