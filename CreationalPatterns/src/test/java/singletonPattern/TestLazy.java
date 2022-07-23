package singletonPattern;

import com.CounterX.singletonPattern.Lazy;
import org.junit.Test;
import org.junit.runner.OrderWith;

import java.lang.reflect.*;

public class TestLazy {
    @Test
    public void test2() {
        System.out.println("测试懒汉式单例，两次获取的应是同一对象");
        Lazy lazy1 = Lazy.getLazy();
        Lazy lazy2 = Lazy.getLazy();
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);
        assert lazy1 == lazy2;
    }

    @Test
    public void test1() {
        System.out.println("测试并发，10个线程大概率获取的不是同一个对象");
        System.out.println("此方法必须单独执行或者第一个执行");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Lazy.getLazy());
            }).start();
        }
    }
    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("测试反射，两个应为不同的对象");
        Lazy lazy1 = Lazy.getLazy();
        Class<?> clazz = lazy1.getClass();
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Lazy lazy2 = (Lazy) constructor.newInstance(null);
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);
        assert lazy1 != lazy2;
    }
}
