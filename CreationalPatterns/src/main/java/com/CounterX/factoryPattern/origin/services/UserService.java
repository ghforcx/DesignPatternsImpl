package com.CounterX.factoryPattern.origin.services;

import com.CounterX.factoryPattern.origin.dataSources.DataSource;
import com.CounterX.factoryPattern.origin.dataSources.DataSourceImpl;

public class UserService {
    private DataSource dataSource;

    public UserService() {
        System.out.println("UserService：读取 UserService 配置");
        System.out.println("UserService：获取数据源");
        dataSource = new DataSourceImpl();
    }


}
