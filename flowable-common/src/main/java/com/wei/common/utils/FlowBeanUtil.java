package com.wei.common.utils;


import com.yuweix.tripod.core.BeanUtil;
import java.util.List;


public abstract class FlowBeanUtil extends BeanUtil {
    public static<T> boolean exists(List<T> list, T one){
        for (T t: list) {
            if (t.equals(one)) {
                return true;
            }
        }
        return false;
    }
}
