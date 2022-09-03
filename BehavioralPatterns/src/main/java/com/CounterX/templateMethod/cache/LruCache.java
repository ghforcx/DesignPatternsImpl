package com.CounterX.templateMethod.cache;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache extends AbstractCache implements Cache, Serializable {

    private final int capacity;

    public LruCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>();
    }

    /**
     * 移除最长未被访问的元素
     */
    @Override
    protected void removeExtra() {
        while (cache.size() > capacity) {
            Iterator<Object> iter = cache.keySet().iterator();
            cache.remove(iter.next());
        }
    }

    /**
     * 查询，并更新顺序。
     * 如果缓存中的元素被查询，那么需要将其放至队列尾端
     * @param key 对象的 key
     * @return 查询的结果
     */
    @Override
    public Object query(Object key) {
        Object value = cache.get(key);
        if (value == null) return null;
        // 如果不为空，更新其位置
        cache.remove(key);
        cache.put(key, value);
        return value;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("LruCache{");
        for (Map.Entry<Object, Object> entry : cache.entrySet()) {
            builder.append(entry.getKey()).append(":").append(entry.getValue()).append(", ");
        }
        builder.append("\b\b}");
        return builder.toString();
    }
}
