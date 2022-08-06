package proxyPattern.staticProxyTest;

import com.CounterX.proxyPattern.staticProxy.Dog;
import com.CounterX.proxyPattern.staticProxy.DogImpl;
import com.CounterX.proxyPattern.staticProxy.DogNameProxy;
import org.junit.Test;

public class DogNameProxyTest {
    @Test
    public void testBarkOrder1() {
        System.out.println("staticProxyTest.DogNameProxyTest.testBarkOrder2");
        Dog dog = new DogNameProxy();
        assert dog.bark() == -1;
        dog.setName("name");
        assert dog.bark() == 0;
    }
}
