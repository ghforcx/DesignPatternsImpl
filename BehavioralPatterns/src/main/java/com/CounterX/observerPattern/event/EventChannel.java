package com.CounterX.observerPattern.event;

import com.CounterX.observerPattern.observer.Observer;

import java.util.ArrayList;

public class EventChannel {
    private final ArrayList<Observer> observers = new ArrayList<>();

    public void registry(Observer observer) {
        observers.add(observer);
    }

    public void onEvent(Event event) {
        observers.forEach((observer -> observer.onEvent(event)));
    }
}
