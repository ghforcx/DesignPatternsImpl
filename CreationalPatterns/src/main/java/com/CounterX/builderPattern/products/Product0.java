package com.CounterX.builderPattern.products;

import com.CounterX.builderPattern.constant.ProductTypeEnum;
import lombok.Data;

@Data
public class Product0 extends Product{

    private int id;
    private ProductTypeEnum type = ProductTypeEnum.DEFAULT;
    private String name;

    public Product0() {}

    public Product0(int id) {
        this.id = id;
    }

    public Product0(ProductTypeEnum type) {
        this.type = type;
    }

    public Product0(String name) {
        this.name = name;
    }

    public Product0(int id, ProductTypeEnum type) {
        this.id = id;
        this.type = type;
    }

    public Product0(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product0(ProductTypeEnum type, String name) {
        this.type = type;
        this.name = name;
    }

    public Product0(int id, ProductTypeEnum type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }
}
