package me.bukp.domon.framework;

import me.bukp.domon.framework.bean.ControllerHelper;
import me.bukp.domon.framework.helper.BeanHelper;
import me.bukp.domon.framework.helper.ClassHelper;
import me.bukp.domon.framework.helper.IocHelper;
import me.bukp.domon.framework.util.ClassUtil;

/**
 * 加载helper类
 * <p>
 * Created by bukp on 2016/8/30.
 */
public final class HelpLoader {

    public static void init() {
        Class<?>[] classlist = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classlist) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}
