package singletonPattern;

import com.CounterX.singletonPattern.Hungry;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestHungry {

    @Test
    public void test1() {
        System.out.println("测试并发，10个线程应打印同一对象");
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Hungry.getInstance());
            }).start();
        }

    }

    @Test
    public void test2() {
        System.out.println("测试饿汉式单例，两次获取的应该是同一个对象");
        Hungry hungry1 = Hungry.getInstance();
        Hungry hungry2 = Hungry.getInstance();
        System.out.println(hungry1);
        System.out.println(hungry2);
        System.out.println(hungry1 == hungry2);
        assert hungry1 == hungry2;
    }

    @Test
    public void test3() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("通过反射破坏单例，应产生两个不同的对象（哈希值不同）");
        Hungry hungry1 = Hungry.getInstance();
        Class<?> clazz = hungry1.getClass();
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Hungry hungry2 = (Hungry) constructor.newInstance(null);
        System.out.println(hungry1);
        System.out.println(hungry2);
        System.out.println(hungry1 == hungry2);
        assert hungry1 != hungry2;
    }

    @Test
    public void test4() {
        System.out.println("通过序列化破解单例，应为两个不同的对象");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Hungry hungry = Hungry.getInstance();
        try {
            // Write Object to file
            fileOutputStream = new FileOutputStream("./1.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(hungry);
            // Read Object from file
            fileInputStream = new FileInputStream("./1.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Hungry hungry1 = (Hungry) objectInputStream.readObject();
            // compare
            System.out.println(hungry);
            System.out.println(hungry1);
            assert hungry != hungry1;
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
