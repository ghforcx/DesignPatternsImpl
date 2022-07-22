package com.CounterX.factoryPattern.factory.services;

import com.CounterX.factoryPattern.factory.SessionContext;
import com.CounterX.factoryPattern.factory.dataSources.DataSource;
import com.CounterX.factoryPattern.factory.dataSources.DataSourceImpl;

public class UserService {
    private DataSource dataSource;

    public UserService() {
        System.out.println("UserService：读取 UserService 配置");
        System.out.println("UserService：获取数据源");
        dataSource = SessionContext.getDataSource();
    }


}
