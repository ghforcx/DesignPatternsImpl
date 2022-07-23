package singletonPattern;

import com.CounterX.singletonPattern.DclLazy;
import com.CounterX.singletonPattern.DclLazyUnsafe;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestDclLazyUnsafe {

    // TODO 无法测出由于指令重排导致的问题
    @Test
    public void test1() throws InterruptedException {
        System.out.println("测试并发，10个线程应打印同一个对象");
        for (int i = 0; i < (Integer.MAX_VALUE >> 10); i++) {
            new Thread(() -> {
                if (DclLazyUnsafe.getInstance().getId() != 99) System.out.println("发生错误");
            }).start();
        }
        System.out.println("Done");
//        TimeUnit.MILLISECONDS.sleep(100);
    }

    @Test
    public void test2() {
        System.out.println("测试懒汉式单例，两次获取的应是同一对象");
        DclLazyUnsafe lazy1 = DclLazyUnsafe.getInstance();
        DclLazyUnsafe lazy2 = DclLazyUnsafe.getInstance();
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);
        assert lazy1 == lazy2;
    }

    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("测试反射，两个应为不同的对象");
        DclLazyUnsafe lazy1 = DclLazyUnsafe.getInstance();
        Class<?> clazz = lazy1.getClass();
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        DclLazyUnsafe lazy2 = (DclLazyUnsafe) constructor.newInstance(null);
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);
        assert lazy1 != lazy2;
    }
}
