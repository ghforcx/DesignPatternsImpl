package com.CounterX.factoryPattern.origin.dataSources;

public class DataSourceImpl implements DataSource{
    public DataSourceImpl() {
        System.out.println("DataSourceImpl：读取配置");
        System.out.println("DataSourceImpl：连接数据库");
        System.out.println("DataSourceImpl：初始化完成");
    }
}
