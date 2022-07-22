package com.CounterX.factoryPattern.origin.services;

import com.CounterX.factoryPattern.origin.dataSources.DataSource;
import com.CounterX.factoryPattern.origin.dataSources.DataSourceImpl;

public class OrderService {
    private DataSource dataSource;

    public OrderService() {
        System.out.println("OrderService：读取 OrderService 配置");
        System.out.println("OrderService：获取数据源");
        dataSource = new DataSourceImpl();
    }


}
