package bridgePattern;

import com.CounterX.bridgePattern.driver.AbstractDriver;
import com.CounterX.bridgePattern.driver.MockMysqlDriver;
import com.CounterX.bridgePattern.logger.MockConsoleLogger;
import com.CounterX.bridgePattern.logger.MockConsoleLogger2;
import org.junit.Test;

public class BridgeTest {

    @Test
    public void test01() {
        System.out.println("测试 logger");
        AbstractDriver mj = new MockMysqlDriver(new MockConsoleLogger());
        mj.mockGetConnection();
    }

    @Test
    public void test02() {
        System.out.println("测试 logger2");
        AbstractDriver mj = new MockMysqlDriver(new MockConsoleLogger2());
        mj.mockGetConnection();
    }
}
