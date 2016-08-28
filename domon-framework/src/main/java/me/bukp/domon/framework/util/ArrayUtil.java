package me.bukp.domon.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 数组工具类
 * <p>
 * Created by bukp on 2016/8/28.
 */
public final class ArrayUtil {

    /**
     * 判断数据是否非空
     *
     * @param array
     * @return
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     *
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }

}
