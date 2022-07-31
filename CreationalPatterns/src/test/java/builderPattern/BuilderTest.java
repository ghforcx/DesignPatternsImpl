package builderPattern;

import com.CounterX.builderPattern.builder.*;
import com.CounterX.builderPattern.constant.ProductTypeEnum;
import com.CounterX.builderPattern.products.*;
import org.junit.Test;

import java.lang.reflect.Method;

public class BuilderTest {

    @Test
    public void test00() {
        Product0 product = new Product0(1, ProductTypeEnum.COMMON_BUSINESS, "商业产品");
        System.out.println(product);
    }

    @Test
    public void test01() {
        Product1 product = new Product1();
        product.setId(1);
        product.setType(ProductTypeEnum.COMMON_BUSINESS);
        product.setName("商业产品");
        System.out.println(product);
    }

    @Test
    public void test02() {
        Product product = new BusinessBuilder().init()
                .id(1)
                .type(ProductTypeEnum.COMMON_BUSINESS)
                .name("商业产品")
                .build();
        System.out.println(product);
    }

    @Test
    public void test03() {
        Product2 product = new Product2()
                .setId(1)
                .setType(ProductTypeEnum.COMMON_BUSINESS)
                .setName("商业产品");
        System.out.println(product);
    }

}
