package facadePattern;

import com.CounterX.facadePattern.ServerFacade;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void test() {
        ServerFacade server = new ServerFacade();
        System.out.println("模拟升级前");
        server.run("A");
        server.run("B");
        System.out.println("模拟升级后");
        server.setUpdate(true);
        server.run("A");
        server.run("B");
    }
}
