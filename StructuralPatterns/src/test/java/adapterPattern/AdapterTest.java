package adapterPattern;

import com.CounterX.adapterPattern.CallableTask;
import com.CounterX.adapterPattern.MyCallableAdapter;
import com.CounterX.adapterPattern.RunnableTask;

import java.util.concurrent.*;

public class AdapterTest {

    @org.junit.Test
    public void test01() {
        System.out.println("测试 RunnableTask");
        Thread t = new Thread(new RunnableTask());
        t.start();
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @org.junit.Test
    public void test02() {
        System.out.println("测试 CallableTask");
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<?> future = es.submit(new CallableTask());
        System.out.println(future);
        try {
            TimeUnit.MILLISECONDS.sleep(10);
            System.out.println(future);
            System.out.println("[result] " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @org.junit.Test
    public void test03() {
        System.out.println("测试 MyCallableAdapter");
        Callable<String> callable = MyCallableAdapter.adapt(new RunnableTask(), "adapter success");
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<?> future = es.submit(callable);
        System.out.println(future);
        try {
            TimeUnit.MILLISECONDS.sleep(10);
            System.out.println(future);
            System.out.println("[result] " + future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
