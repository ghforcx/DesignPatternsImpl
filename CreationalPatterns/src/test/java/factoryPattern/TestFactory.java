package factoryPattern;

import com.CounterX.factoryPattern.factory.SessionContext;
import com.CounterX.factoryPattern.factory.dataSources.DataSource;
import com.CounterX.factoryPattern.factory.services.*;

public class TestFactory {
    @org.junit.Test
    public void test() {
        DataSource dataSource = SessionContext.getDataSource();
        BookService bookService = SessionContext.getBookService();
        UserService userService = SessionContext.getUserService();
        OrderService orderService = SessionContext.getOrderService();
        CartService cartService = SessionContext.getCartService();
        HistoryService historyService = SessionContext.getHistoryService();
        RecommendService recommendService = SessionContext.getRecommendService();
    }
}
