package com.CounterX.bridgePattern.logger;

public class MockConsoleLogger2 implements MockLogger {

    @Override
    public void log() {
        System.out.print("[logger2] [Mock logging] ");
    }
}
