package com.CounterX.builderPattern.builder;

import com.CounterX.builderPattern.constant.ProductTypeEnum;
import com.CounterX.builderPattern.products.Product;
import com.CounterX.builderPattern.products.Product1;

public class BusinessBuilder implements Builder{
    
    private Product1 product;
    
    @Override
    public Builder init() {
        product = new Product1();
        return this;
    }

    @Override
    public Product build() {
        return product;
    }

    @Override
    public Builder id(int id) {
        product.setId(id);
        return this;
    }

    @Override
    public Builder type(ProductTypeEnum type) {
        product.setType(type);
        return this;
    }

    @Override
    public Builder name(String name) {
        product.setName(name);
        return this;
    }
}
