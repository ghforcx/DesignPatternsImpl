package com.CounterX.templateMethod.cache;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FifoCache extends AbstractCache implements Cache, Serializable {

    private final int capacity;

    public FifoCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>();
    }

    @Override
    public Object query(Object key) {
        return cache.get(key);
    }

    /**
     * 使用 FIFO 策略移除最老的元素
     */
    @Override
    protected void removeExtra() {
        while (cache.size() > capacity) {
            Iterator<Object> iter = cache.keySet().iterator();
            cache.remove(iter.next());
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("FifoCache{");
        for (Map.Entry<Object, Object> entry : cache.entrySet()) {
            builder.append(entry.getKey()).append(":").append(entry.getValue()).append(", ");
        }
        builder.append("\b\b}");
        return builder.toString();
    }
}
