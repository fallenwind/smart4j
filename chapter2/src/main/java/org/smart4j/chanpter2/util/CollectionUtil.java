package org.smart4j.chanpter2.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 集合工具类
 */
public class CollectionUtil {

    /**
     *  判断 Collection 是否为空
     */
    public static boolean isEmpty(Collection<?> collection)
    {
        return CollectionUtils.isEmpty(collection);
    }

    public static boolean isNotEmpty(Collection<?> collection)
    {
        return !isEmpty(collection);
    }

    /**
     *  判断 Map 是否为空
     */
    public static boolean isEmpty(Map<?, ?> map)
    {
        return MapUtils.isEmpty(map);
    }

    public static boolean isNotEmpty(Map<?, ?> map)
    {
        return !isEmpty(map);
    }
}
