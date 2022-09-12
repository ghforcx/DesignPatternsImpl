package com.CounterX.observerPattern.observer;

import com.CounterX.observerPattern.event.Event;

public interface Observer {
    void onEvent(Event event);
}
