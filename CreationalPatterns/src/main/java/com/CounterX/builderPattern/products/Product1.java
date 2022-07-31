package com.CounterX.builderPattern.products;

import com.CounterX.builderPattern.constant.ProductTypeEnum;

public class Product1 extends Product{

    private int id;
    private ProductTypeEnum type = ProductTypeEnum.DEFAULT;
    private String name;

    public Product1() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductTypeEnum getType() {
        return type;
    }

    public void setType(ProductTypeEnum type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "id=" + id +
                ", type=" + type +
                ", name=" + name +
                '}';
    }
}
