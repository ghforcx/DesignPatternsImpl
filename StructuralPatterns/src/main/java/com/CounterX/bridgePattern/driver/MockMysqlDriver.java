package com.CounterX.bridgePattern.driver;

import com.CounterX.bridgePattern.logger.MockLogger;

public class MockMysqlDriver extends AbstractDriver {

    private MockLogger logger;

    public MockMysqlDriver(MockLogger logger) {
        this.logger = logger;
    }
    @Override
    public void mockGetConnection() {
        logger.log();
        System.out.println("MySQL connect get");
    }
}
