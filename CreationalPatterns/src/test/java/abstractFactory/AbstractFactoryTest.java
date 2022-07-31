package abstractFactory;

import com.CounterX.abstractFactory.factories.JsonFactory;
import com.CounterX.abstractFactory.factories.XmlFactory;
import com.CounterX.abstractFactory.pojo.User;
import org.junit.Test;

import java.util.Scanner;

public class AbstractFactoryTest {
    private final String xml = "<User>\n\t<id>1</id>\n\t<name>XML</name>\n</User>";
    private final String json = "{\n\t\"id\": 2\n\t\"name\": \"JSON\"\n}";

    @Test
    public void test01() {
        System.out.println("待解析XML文件");
        Scanner scan = new Scanner(xml);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        System.out.println("待解析JSON文件");
        scan = new Scanner(json);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
        System.out.println();
    }

    @Test
    public void test02() {
        System.out.println("通过XmlFactory解析XML");
        User user = new XmlFactory().getUser(xml);
        System.out.println(user);
        System.out.println();
    }

    @Test
    public void test03() {
        System.out.println("通过JsonFactory解析JSON");
        User user = new JsonFactory().getUser(json);
        System.out.println(user);
        System.out.println();
    }
}
