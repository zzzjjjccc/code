package com.zing.thinking_in_java.inner;

public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    private void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
