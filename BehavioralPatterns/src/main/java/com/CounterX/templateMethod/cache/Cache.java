package com.CounterX.templateMethod.cache;

import java.util.Collection;
import java.util.Map;

public interface Cache {
    /**
     * 查询缓存中是否有指定的对象
     * @param key 对象的 key
     * @return 如果命中，那么就返回对应的对象，否则返回 null
     */
    Object query(Object key);

    /**
     * 添加缓存
     * @param key 缓存的 key
     * @param value 缓存的 value
     * @return 是否缓存成功
     */
    boolean put(Object key, Object value);

    /**
     * 清空缓存
     */
    void clear();

    /**
     * 根据集合初始化缓存
     * @param map 存储初始对象的集合
     * @return 初始化成功返回 true
     */
    boolean init(Map<Object, Object> map);
}
