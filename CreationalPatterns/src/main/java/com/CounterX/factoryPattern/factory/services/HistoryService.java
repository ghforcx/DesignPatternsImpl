package com.CounterX.factoryPattern.factory.services;

import com.CounterX.factoryPattern.factory.SessionContext;

public class HistoryService {
    private BookService bookService;
    private UserService userService;
    private OrderService orderService;

    public HistoryService() {
        System.out.println("HistoryService：读取 HistoryService 配置");
        System.out.println("HistoryService：获取书籍信息");
        bookService = SessionContext.getBookService();
        System.out.println("HistoryService：获取用户信息");
        userService = SessionContext.getUserService();
        System.out.println("HistoryService：获取订单信息");
        orderService = SessionContext.getOrderService();
    }


}
