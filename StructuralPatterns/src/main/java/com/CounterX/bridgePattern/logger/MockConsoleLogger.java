package com.CounterX.bridgePattern.logger;

public class MockConsoleLogger implements MockLogger {

    @Override
    public void log() {
        System.out.println("Mock logging");
    }
}
