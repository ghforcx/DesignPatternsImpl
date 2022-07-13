package com.CounterX.proxyPattern.dynamicProxy.singleAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandle implements InvocationHandler {

    private final Object obj;

    public LogHandle(Object obj) {
        this.obj = obj;
    }

    private void log(String msg) {
        System.out.println("[log] method invoke: " + msg);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        return method.invoke(obj, args);
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

}
