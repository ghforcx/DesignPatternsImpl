package com.CounterX.singletonPattern;

import java.awt.color.ICC_ColorSpace;
import java.io.Serializable;

public class InnerClazzSingleton implements Serializable {
    private static class InnerClazz {
        private static final InnerClazzSingleton instance = new InnerClazzSingleton();
    }

    private InnerClazzSingleton() {
//        if (InnerClazz.instance != null) throw new RuntimeException("私有方法不应被调用");
    }

    public static InnerClazzSingleton getInstance() {
        return InnerClazz.instance;
    }
}
