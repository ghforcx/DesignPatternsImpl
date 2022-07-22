package com.CounterX;

import com.CounterX.factoryPattern.origin.services.RecommendService;

public class Main {
    public static void main(String[] args) {
        System.out.println("非工厂方法启动所有服务");
        RecommendService recommendService = new RecommendService();
    }
}