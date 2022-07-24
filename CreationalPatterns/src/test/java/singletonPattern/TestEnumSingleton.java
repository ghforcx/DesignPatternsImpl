package singletonPattern;

import com.CounterX.singletonPattern.EnumSingleton;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public class TestEnumSingleton {

    @Test
    public void test1() throws InterruptedException {
        System.out.println("测试并发，10个线程应打印同一对象");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(EnumSingleton.INSTANCE);
            }).start();
        }
        TimeUnit.MILLISECONDS.sleep(100);
    }

    @Test
    public void test2() {
        System.out.println("测试饿汉式单例，两次获取的应该是同一个对象");
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
        assert singleton1 == singleton2;
    }

    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("通过反射破坏单例，应产生异常");
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        Class<?> clazz = singleton1.getClass();
        // 显示所有的构造器
//        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
//        for (Constructor<?> constructor : constructors) {
//            System.out.println(constructor);
//        }
        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        boolean flag = false;
        try {
            EnumSingleton singleton2 = (EnumSingleton) constructor.newInstance("newInstance", 1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("无法通过反射产生枚举类");
            flag = true;
        }
        assert flag;
    }

    @Test
    public void test4() {
        System.out.println("通过序列化破解单例，应为两个相同的对象");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        try {
            // Write Object to file
            fileOutputStream = new FileOutputStream("./1.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singleton);
            // Read Object from file
            fileInputStream = new FileInputStream("./1.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            EnumSingleton singleton1 = (EnumSingleton) objectInputStream.readObject();
            // compare
            System.out.println(singleton);
            System.out.println(singleton1);
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
