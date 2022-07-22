package com.CounterX.factoryPattern.factory.services;

import com.CounterX.factoryPattern.factory.SessionContext;
import com.CounterX.factoryPattern.factory.dataSources.DataSource;
import com.CounterX.factoryPattern.factory.dataSources.DataSourceImpl;

public class OrderService {
    private DataSource dataSource;

    public OrderService() {
        System.out.println("OrderService：读取 OrderService 配置");
        System.out.println("OrderService：获取数据源");
        dataSource = SessionContext.getDataSource();
    }


}
