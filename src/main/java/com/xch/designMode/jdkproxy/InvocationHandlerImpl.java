package com.xch.designMode.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理模式（jdk）
 * @author xiech
 * @create 2020-01-08 11:02
 */
public class InvocationHandlerImpl implements InvocationHandler {
    private Object target;

    public InvocationHandlerImpl(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("11开启事务");
        Object invoke=method.invoke(target,args);
        System.out.println("11提交事务");
        return invoke;
    }

    public static void main(String[] args) {
        UserDao userDao=new UserDaoImpl();
        InvocationHandlerImpl invocationHandler=new InvocationHandlerImpl(userDao);
        Class<?>[] interfaces = userDao.getClass().getInterfaces();
        ClassLoader classLoader = userDao.getClass().getClassLoader();
        UserDao o = (UserDao) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        o.add();
    }
}
