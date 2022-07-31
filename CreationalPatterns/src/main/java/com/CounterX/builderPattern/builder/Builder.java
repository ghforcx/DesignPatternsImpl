package com.CounterX.builderPattern.builder;

import com.CounterX.builderPattern.constant.ProductTypeEnum;
import com.CounterX.builderPattern.products.Product;

public interface Builder {
    Builder id(int id);
    Builder type(ProductTypeEnum type);
    Builder name(String name);
    Builder init();
    Product build();
}
