package org.simpleframework.aop.aspect;

import java.lang.reflect.Method;

/**
 * @author lx
 * @date 2021/5/21 11:34 上午
 */
public class DefaultAspect {

    /**
     * 事前拦截
     * @param targetClass
     * @param method
     * @param args
     * @throws Throwable
     */
    public void before(Class<?> targetClass, Method method, Object[] args) throws Throwable {

    }

    /**
     * 事后拦截
     * @param targetClass
     * @param method
     * @param args
     * @param returnValue
     * @return
     * @throws Throwable
     */
    public Object afterReturning(Class<?> targetClass, Method method, Object[] args, Object returnValue) throws Throwable {
        return returnValue;
    }

    /**
     * 事后拦截（异常会执行）
     * @param targetClass
     * @param method
     * @param args
     * @param e
     * @throws Throwable
     */
    public void afterThrowing(Class<?> targetClass, Method method, Object[] args, Throwable e) throws Throwable {
    }
}
