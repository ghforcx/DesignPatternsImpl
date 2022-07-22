package com.CounterX.factoryPattern.factory;

import com.CounterX.factoryPattern.factory.dataSources.DataSource;
import com.CounterX.factoryPattern.factory.dataSources.DataSourceImpl;
import com.CounterX.factoryPattern.factory.services.*;

public class SessionContext {
    private static DataSource dataSource = new DataSourceImpl();
    private static BookService bookService = new BookService();
    private static UserService userService = new UserService();
    private static OrderService orderService = new OrderService();
    private static CartService cartService = new CartService();
    private static HistoryService historyService = new HistoryService();
    private static RecommendService recommendService = new RecommendService();

    public static DataSource getDataSource() {
        return dataSource;
    }

    public static BookService getBookService() {
        return bookService;
    }

    public static UserService getUserService() {
        return userService;
    }

    public static OrderService getOrderService() {
        return orderService;
    }

    public static CartService getCartService() {
        return cartService;
    }

    public static HistoryService getHistoryService() {
        return historyService;
    }

    public static RecommendService getRecommendService() {
        return recommendService;
    }
}
