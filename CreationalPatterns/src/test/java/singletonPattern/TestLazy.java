package singletonPattern;

import com.CounterX.singletonPattern.Lazy;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.*;

public class TestLazy {

    @Test
    public void test1() {
        System.out.println("测试并发，10个线程大概率获取的不是同一个对象");
        System.out.println("此方法必须单独执行或者第一个执行");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Lazy.getInstance());
            }).start();
        }
    }

    @Test
    public void test2() {
        System.out.println("测试懒汉式单例，两次获取的应是同一对象");
        Lazy lazy1 = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);
        assert lazy1 == lazy2;
    }

    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("通过反射破坏单例，两个应为不同的对象");
        Lazy lazy1 = Lazy.getInstance();
        Class<?> clazz = lazy1.getClass();
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Lazy lazy2 = (Lazy) constructor.newInstance(null);
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);
        assert lazy1 != lazy2;
    }

    @Test
    public void test4() {
        System.out.println("通过序列化破解单例，应为两个不同的对象");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Lazy lazy = Lazy.getInstance();
        try {
            // Write Object to file
            fileOutputStream = new FileOutputStream("./1.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(lazy);
            // Read Object from file
            fileInputStream = new FileInputStream("./1.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Lazy lazy1 = (Lazy) objectInputStream.readObject();
            // compare
            System.out.println(lazy);
            System.out.println(lazy1);
            assert lazy != lazy1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                objectOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                objectInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
