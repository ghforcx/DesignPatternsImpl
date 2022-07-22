package com.CounterX.factoryPattern.origin.services;

import com.CounterX.factoryPattern.origin.dataSources.DataSource;
import com.CounterX.factoryPattern.origin.dataSources.DataSourceImpl;

public class CartService {
    private BookService bookService;
    private UserService userService;

    public CartService() {
        System.out.println("CartService：读取 CartService 配置");
        System.out.println("CartService：获取书籍信息");
        bookService = new BookService();
        System.out.println("CartService：获取用户信息");
        userService = new UserService();
    }


}
