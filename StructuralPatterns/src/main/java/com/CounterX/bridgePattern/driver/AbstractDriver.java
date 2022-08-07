package com.CounterX.bridgePattern.driver;

import com.CounterX.bridgePattern.logger.MockLogger;

public abstract class AbstractDriver {
    private MockLogger logger;

    public MockLogger getLogger() {
        return logger;
    }

    public void setLogger(MockLogger logger) {
        this.logger = logger;
    }

    public abstract  void mockGetConnection();
}
