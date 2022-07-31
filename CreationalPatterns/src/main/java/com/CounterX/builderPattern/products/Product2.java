package com.CounterX.builderPattern.products;

import com.CounterX.builderPattern.constant.ProductTypeEnum;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class Product2 extends Product{

    private int id;
    private ProductTypeEnum type = ProductTypeEnum.DEFAULT;
    private String name;

    public int getId() {
        return id;
    }

    public Product2 setId(int id) {
        this.id = id;
        return this;
    }

    public ProductTypeEnum getType() {
        return type;
    }

    public Product2 setType(ProductTypeEnum type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product2 setName(String name) {
        this.name = name;
        return this;
    }
}
