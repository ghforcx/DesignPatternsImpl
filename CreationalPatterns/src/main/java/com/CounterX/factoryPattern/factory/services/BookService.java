package com.CounterX.factoryPattern.factory.services;

import com.CounterX.factoryPattern.factory.SessionContext;
import com.CounterX.factoryPattern.factory.dataSources.DataSource;
import com.CounterX.factoryPattern.factory.dataSources.DataSourceImpl;

public class BookService {
    private DataSource dataSource;

    public BookService() {
        System.out.println("BookService：读取配置");
        System.out.println("BookService：获取数据源");
        dataSource = SessionContext.getDataSource();
    }


}
