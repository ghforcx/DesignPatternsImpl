package factoryPattern;

import com.CounterX.factoryPattern.origin.dataSources.DataSource;
import com.CounterX.factoryPattern.origin.dataSources.DataSourceImpl;
import com.CounterX.factoryPattern.origin.services.*;

public class TestOrigin {
    @org.junit.Test
    public void test() {
        DataSource dataSource = new DataSourceImpl();
        BookService bookService = new BookService();
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        CartService cartService = new CartService();
        HistoryService historyService = new HistoryService();
        RecommendService recommendService = new RecommendService();
    }
}
