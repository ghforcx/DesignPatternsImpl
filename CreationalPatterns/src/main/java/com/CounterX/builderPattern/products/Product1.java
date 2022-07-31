package com.CounterX.builderPattern.products;

import com.CounterX.builderPattern.constant.ProductTypeEnum;
import lombok.Data;

@Data
public class Product1 extends Product{

    private int id;
    private ProductTypeEnum type = ProductTypeEnum.DEFAULT;
    private String name;

    public Product1() {}

    public Product1(int id) {
        this.id = id;
    }

    public Product1(ProductTypeEnum type) {
        this.type = type;
    }

    public Product1(String name) {
        this.name = name;
    }

    public Product1(int id, ProductTypeEnum type) {
        this.id = id;
        this.type = type;
    }

    public Product1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product1(ProductTypeEnum type, String name) {
        this.type = type;
        this.name = name;
    }

    public Product1(int id, ProductTypeEnum type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }
}
