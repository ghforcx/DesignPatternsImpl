package com.CounterX.factoryPattern.factory.services;

import com.CounterX.factoryPattern.factory.SessionContext;

public class CartService {
    private BookService bookService;
    private UserService userService;

    public CartService() {
        System.out.println("CartService：读取 CartService 配置");
        System.out.println("CartService：获取书籍信息");
        bookService = SessionContext.getBookService();
        System.out.println("CartService：获取用户信息");
        userService = SessionContext.getUserService();
    }


}
