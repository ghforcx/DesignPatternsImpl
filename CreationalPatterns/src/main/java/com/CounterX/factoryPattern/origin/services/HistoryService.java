package com.CounterX.factoryPattern.origin.services;

public class HistoryService {
    private BookService bookService;
    private UserService userService;
    private OrderService orderService;

    public HistoryService() {
        System.out.println("HistoryService：读取 HistoryService 配置");
        System.out.println("HistoryService：获取书籍信息");
        bookService = new BookService();
        System.out.println("HistoryService：获取用户信息");
        userService = new UserService();
        System.out.println("HistoryService：获取订单信息");
        orderService = new OrderService();
    }


}
