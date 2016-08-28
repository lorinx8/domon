package me.bukp.domon.framework.helper;

import me.bukp.domon.framework.annotation.Inject;
import me.bukp.domon.framework.util.ArrayUtil;
import me.bukp.domon.framework.util.CollectionUtil;
import me.bukp.domon.framework.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * 依赖注入助手类
 * <p>
 * Created by bukp on 2016/8/28.
 */
public final class IocHelper {

    /**
     * 获取所有的bean类和bean实例之间的映射关系
     * 遍历这个映射关系，通过反射关系获取类中的所有成员变量
     * 继续遍历这些成员变量，在循环中判断当前成员变量是否带有inject注解
     * 若带有该注解，则从bean map中根据bean类取出bean实例
     * 最后通过reflectionUtil#setField方法修改当前成员变量的值
     */
    static {
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                // 获取bean类定义的所有成员变量（bean field）
                Field[] beanFields = beanClass.getDeclaredFields();
                if (ArrayUtil.isNotEmpty(beanFields)) {
                    for (Field beanField : beanFields) {
                        if (beanField.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if (beanFieldInstance != null) {
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
