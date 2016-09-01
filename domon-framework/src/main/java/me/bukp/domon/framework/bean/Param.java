package me.bukp.domon.framework.bean;

import me.bukp.domon.framework.util.CastUtil;

import java.util.Map;

/**
 * 请求参数对象
 * <p>
 * Created by bukp on 2016/8/30.
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名，获取long型参数值
     *
     * @param name
     * @return
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有参数信息
     *
     * @return
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}
