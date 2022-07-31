package com.CounterX.abstractFactory.factories;

import com.CounterX.abstractFactory.pojo.User;

public interface AbstractFactory {
    User getUser(String fileName);
}
