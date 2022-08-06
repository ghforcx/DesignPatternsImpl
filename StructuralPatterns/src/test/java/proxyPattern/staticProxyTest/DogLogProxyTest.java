package proxyPattern.staticProxyTest;

import com.CounterX.proxyPattern.staticProxy.Dog;
import com.CounterX.proxyPattern.staticProxy.DogImpl;
import com.CounterX.proxyPattern.staticProxy.DogLogProxy;
import org.junit.Test;

public class DogLogProxyTest {
    @Test
    public void testGetSetNameOrder1() {
        System.out.println("staticProxyTest.DogLogProxyTest.testGetSetNameOrder1");
        Dog dog = new DogLogProxy();
        String name1 = "name1";
        System.out.println("set name: " + name1);
        dog.setName(name1);
        String name2 = dog.getName();
        System.out.println("get name: " + name2);
        assert name1.equals(name2);
    }
    @Test
    public void testBarkOrder2() {
        System.out.println("staticProxyTest.DogLogProxyTest.testBarkOrder2");
        Dog dog = new DogLogProxy();
        assert dog.bark() == -1;
        dog.setName("name");
        assert dog.bark() == 0;
    }
}
