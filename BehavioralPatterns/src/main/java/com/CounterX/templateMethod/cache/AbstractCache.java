package com.CounterX.templateMethod.cache;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class AbstractCache implements Cache {
    /**
     * 使用 map 作为缓存
     */
    Map<Object, Object> cache = null;

    /**
     * 查询方法，具体的实现交由子类
     * @param key 对象的 key
     * @return key 对应的 value
     */
    @Override
    public abstract Object query(Object key);

    /**
     * 清空缓存
     */
    @Override
    public void clear() {
        if (cache != null) cache.clear();
    }

    /**
     * 初始化缓存
     * @param map 存储初始对象的集合
     * @return 如果缓存有效则为 true, 否则为 false
     */
    @Override
    public boolean init(Map<Object, Object> map) {
        if (cache == null) return false;
        cache.putAll(map);
        return true;
    }

    @Override
    public boolean put(Object key, Object value) {
        if (cache.get(key) != null) cache.remove(key);
        cache.put(key, value);
        removeExtra();
        return true;
    }

    /**
     * 移除多余元素的具体实现方法
     */
    protected abstract void removeExtra();
}
