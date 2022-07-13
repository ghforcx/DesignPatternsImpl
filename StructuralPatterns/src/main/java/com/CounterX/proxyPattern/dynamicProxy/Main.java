package com.CounterX.proxyPattern.dynamicProxy;

import com.CounterX.proxyPattern.dynamicProxy.pojo.Animal;
import com.CounterX.proxyPattern.dynamicProxy.pojo.Bird;
import com.CounterX.proxyPattern.dynamicProxy.pojo.Cat;
import com.CounterX.proxyPattern.dynamicProxy.pojo.Dog;
import com.CounterX.proxyPattern.dynamicProxy.singleAop.LogHandle;

public class Main {
    public static void main(String[] args) {
        // 动态代理
        Animal dog = (Animal) new LogHandle(new Dog()).getProxy();
        Animal cat = (Animal) new LogHandle(new Cat()).getProxy();
        Animal bird = (Animal) new LogHandle(new Bird()).getProxy();
        dog.call();
        cat.call();
        bird.call();
    }
}