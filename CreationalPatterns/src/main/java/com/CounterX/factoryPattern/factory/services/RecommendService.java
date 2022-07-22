package com.CounterX.factoryPattern.factory.services;

import com.CounterX.factoryPattern.factory.SessionContext;

public class RecommendService {
    private CartService cartService;
    private HistoryService historyService;

    public RecommendService() {
        System.out.println("RecommendService：读取推荐配置");
        System.out.println("RecommendService：获取购物车信息");
        cartService = SessionContext.getCartService();
        System.out.println("RecommendService：获取历史订单信息");
        historyService = SessionContext.getHistoryService();
    }
}
