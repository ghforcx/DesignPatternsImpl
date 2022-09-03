package templateMethod;

import com.CounterX.templateMethod.cache.Cache;
import com.CounterX.templateMethod.cache.FifoCache;
import com.CounterX.templateMethod.cache.LruCache;
import org.junit.Test;

public class CacheTest {
    @Test
    public void test01() {
        System.out.println("使用 FIFO 策略");
        test(new FifoCache(3));
    }

    @Test
    public void test02() {
        System.out.println("使用 LRU 策略");
        test(new LruCache(3));
    }

    private void test(Cache cache) {
        cache.put("1", "123");
        cache.put("2", "246");
        cache.put("3", "369");
        System.out.println("初始缓存为：");
        System.out.println(cache);
        cache.put("1", "147");
        System.out.println("更新 1:147, 缓存变为：");
        System.out.println(cache);
        cache.query("2");
        System.out.println("查询 2, 缓存变为：");
        System.out.println(cache);
        cache.put("4", "456");
        System.out.println("插入 4:456, 缓存变为：");
        System.out.println(cache);
    }
}
