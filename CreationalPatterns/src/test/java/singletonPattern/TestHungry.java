package singletonPattern;

import com.CounterX.singletonPattern.Hungry;
import com.CounterX.singletonPattern.Lazy;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestHungry {
    @Test
    public void testSingle() {
        System.out.println("测试饿汉式单例，两次获取的应该是同一个对象");
        Hungry hungry1 = Hungry.getHungry();
        Hungry hungry2 = Hungry.getHungry();
        System.out.println(hungry1);
        System.out.println(hungry2);
        System.out.println(hungry1 == hungry2);
        assert hungry1 == hungry2;
    }

    @Test
    public void testConcurrent() {
        System.out.println("测试并发，10个线程应打印同一对象");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Hungry.getHungry());
            }).start();
        }

    }
    @Test
    public void testReflect() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("测试反射，应产生两个不同的对象（句柄不同）");
        Hungry hungry1 = Hungry.getHungry();
        Class<?> clazz = hungry1.getClass();
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Hungry hungry2 = (Hungry) constructor.newInstance(null);
        System.out.println(hungry1);
        System.out.println(hungry2);
        System.out.println(hungry1 == hungry2);
        assert hungry1 != hungry2;
    }
}
