package com.CounterX.singletonPattern;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

public class DclLazyUnsafe implements Serializable {

    private static DclLazyUnsafe instance;

    //TODO : 无法测试出不加 volatile 由于指令重排而产生的 bug
    private int id;

    private DclLazyUnsafe() {
        id = 10;
        try {
            TimeUnit.MICROSECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        id = 99;
    }

    public static DclLazyUnsafe getInstance() {
        DclLazyUnsafe local = instance;
        while (local == null) {
            synchronized (DclLazy.class) {
                local = instance;
                if (local == null) {
                    local = instance = new DclLazyUnsafe();
                }
            }
        }
        return local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DclLazy{" +
                "id=" + id +
                '}' + super.toString();
    }

    private void init() {
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setId(99);
    }
}
