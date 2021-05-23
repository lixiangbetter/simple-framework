package org.simpleframework.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * @author lx
 * @date 2021/5/21 1:24 下午
 */
public class ProxyCreator {
    /**
     * 创建动态代理对象并返回
     * @param targetClass
     * @param methodInterceptor
     * @return
     */
    public static Object createProxy(Class<?> targetClass, MethodInterceptor methodInterceptor) {
        return Enhancer.create(targetClass, methodInterceptor);
    }
}
