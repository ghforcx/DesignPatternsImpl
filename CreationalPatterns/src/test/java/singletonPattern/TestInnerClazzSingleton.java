package singletonPattern;

import com.CounterX.singletonPattern.InnerClazzSingleton;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

public class TestInnerClazzSingleton {

    @Test
    public void test1() throws InterruptedException {
        System.out.println("测试并发，10个线程应打印同一个对象");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(InnerClazzSingleton.getInstance());
            }).start();
        }
        TimeUnit.MILLISECONDS.sleep(100);
    }

    @Test
    public void test2() {
        System.out.println("测试懒汉式单例，两次获取的应是同一对象");
        InnerClazzSingleton lazy1 = InnerClazzSingleton.getInstance();
        InnerClazzSingleton lazy2 = InnerClazzSingleton.getInstance();
        System.out.println(lazy1);
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);
        assert lazy1 == lazy2;
    }

    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("通过反射破坏单例，两个应为不同的对象");
        InnerClazzSingleton lazy1 = InnerClazzSingleton.getInstance();
        Class<?> clazz = lazy1.getClass();
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        InnerClazzSingleton lazy2 = (InnerClazzSingleton) constructor.newInstance(null);
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
        InnerClazzSingleton singleton = InnerClazzSingleton.getInstance();
        try {
            // Write Object to file
            fileOutputStream = new FileOutputStream("./1.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singleton);
            // Read Object from file
            fileInputStream = new FileInputStream("./1.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            InnerClazzSingleton singleton1 = (InnerClazzSingleton) objectInputStream.readObject();
            // compare
            System.out.println(singleton);
            System.out.println(singleton1);
            assert singleton != singleton1;
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
