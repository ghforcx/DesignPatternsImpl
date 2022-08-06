package proxyPattern.dynamicProxyTest;

import com.CounterX.proxyPattern.dynamicProxy.pojo.Animal;
import com.CounterX.proxyPattern.dynamicProxy.pojo.Bird;
import com.CounterX.proxyPattern.dynamicProxy.pojo.Cat;
import com.CounterX.proxyPattern.dynamicProxy.pojo.Dog;
import com.CounterX.proxyPattern.dynamicProxy.singleAop.LogHandle;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class LogHandleTest {
    @Test
    public void testLogHandle() {
        System.out.println("LogHandleTest.testLogHandle");
        InvocationHandler h1 = new LogHandle(new Dog());
        InvocationHandler h2 = new LogHandle(new Cat());
        InvocationHandler h3 = new LogHandle(new Bird());
        ClassLoader cl = h1.getClass().getClassLoader();
        Class<?>[] interfaces = new Class[]{Animal.class};
        Animal dog = (Animal) Proxy.newProxyInstance(cl, interfaces, h1);
        Animal cat = (Animal) Proxy.newProxyInstance(cl, interfaces, h2);
        Animal bird = (Animal) Proxy.newProxyInstance(cl, interfaces, h3);
        dog.call();
        cat.call();
        bird.call();
    }
    @Test
    public void testGetProxy() {
        System.out.println("LogHandleTest.testGetProxy");
        Animal dog = (Animal) new LogHandle(new Dog()).getProxy();
        Animal cat = (Animal) new LogHandle(new Cat()).getProxy();
        Animal bird = (Animal) new LogHandle(new Bird()).getProxy();
        dog.call();
        cat.call();
        bird.call();
    }
}
