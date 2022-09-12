package com.CounterX.observerPattern.event;

import java.time.LocalDateTime;

public class Event {
    private final LocalDateTime time;
    private final String message;

    public Event(String message) {
        this.time = LocalDateTime.now();
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Event{" +
                "time=" + time +
                ", message='" + message + '\'' +
                '}';
    }
}
