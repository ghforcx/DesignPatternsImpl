package proxyPattern.staticProxyTest;

import com.CounterX.proxyPattern.staticProxy.Dog;
import com.CounterX.proxyPattern.staticProxy.DogImpl;
import org.junit.Test;

public class DogImplTest {
    @Test
    public void testGetSetNameOrder1() {
        System.out.println("staticProxyTest.DogImplTest.testGetSetNameOrder1");
        Dog dog = new DogImpl();
        String name1 = "name1";
        System.out.println("set name: " + name1);
        dog.setName(name1);
        String name2 = dog.getName();
        System.out.println("get name: " + name2);
        assert name1.equals(name2);
    }
    @Test
    public void testBarkOrder2() {
        System.out.println("staticProxyTest.DogImplTest.testBarkOrder2");
        Dog dog = new DogImpl();
        dog.setName("name");
        dog.bark();
    }
}
