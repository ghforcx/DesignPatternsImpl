package chainPattern;

import com.CounterX.chainPattern.ProcessHandle;
import com.CounterX.chainPattern.Processor;
import com.CounterX.chainPattern.registers.ArrayRegister;
import com.CounterX.chainPattern.registers.LinkedRegister;
import com.CounterX.chainPattern.registers.Register;
import org.junit.Test;

public class ChainTest {
    private final Processor p1 = new Processor("处理器 1", "pre1", "post1", "after1");
    private final Processor p2 = new Processor("处理器 2", "pre2", "post2", "after2");
    private final Processor p3 = new Processor("处理器 3", "pre3", "post3", "after3");

    private void initRegister(Register register) {
        register.regist(p1);
        register.regist(p2);
        register.regist(p3);
    }

    @Test
    public void test01() {
        System.out.println("测试数组式记录");
        Register register = new ArrayRegister();
        initRegister(register);
        ProcessHandle handle = new ProcessHandle(register);
        handle.doProcess();
    }

    @Test
    public void test02() {
        System.out.println("测试链表式记录");
        Register register = new LinkedRegister();
        initRegister(register);
        ProcessHandle handle = new ProcessHandle(register);
        handle.doProcess();
    }
}
