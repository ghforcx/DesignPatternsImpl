package com.CounterX.factoryPattern.origin.services;

import com.CounterX.factoryPattern.origin.dataSources.DataSource;
import com.CounterX.factoryPattern.origin.dataSources.DataSourceImpl;

public class BookService {
    private DataSource dataSource;

    public BookService() {
        System.out.println("BookService：读取配置");
        System.out.println("BookService：获取数据源");
        dataSource = new DataSourceImpl();
    }


}
