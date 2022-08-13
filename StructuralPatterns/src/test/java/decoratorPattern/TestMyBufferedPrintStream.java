package decoratorPattern;

import com.CounterX.decoratorPattern.MyBufferedPrintStream;
import org.junit.Test;

public class TestMyBufferedPrintStream {
    @Test
    public void test() {
        System.out.println("测试自定义缓冲输出类，每3行输出一次");
        MyBufferedPrintStream out = new MyBufferedPrintStream(System.out, 3);
        for (int i = 0; i < 4; i++) {
            System.out.println("写入 line " + i);
            out.println("  输出 line " + i);
        }
        System.out.println("清空缓冲区");
        out.flush();
        out.close();
    }
}
