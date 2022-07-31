package protoTypePattern;

import com.CounterX.prototypePattern.Blog;
import com.CounterX.prototypePattern.User;

public class PrototypeTest {

    @org.junit.Test
    public void test01() {
        System.out.println("测试普通类 User 的克隆和拷贝");
        User user = new User(1, "小明");
        System.out.println(user);
        System.out.println("通过 clone 方法产生新的 User 对象");
        System.out.println(user.clone());
        System.out.println("通过 copy 方法产生新的 User 对象");
        System.out.println(user.copy());
        System.out.println();
    }

    @org.junit.Test
    public void test02() {
        System.out.println("测试包含引用的 Blog 类的克隆和拷贝");
        User user = new User(1, "小明");
        Blog blog = new Blog("今天天气很好", user);
        System.out.println(blog);
        System.out.println("通过 clone 方法产生新的 Blog 对象");
        System.out.println(blog.clone());
        System.out.println("通过 copy 方法产生新的 Blog 对象");
        System.out.println(blog.copy());
        System.out.println();
    }

}
