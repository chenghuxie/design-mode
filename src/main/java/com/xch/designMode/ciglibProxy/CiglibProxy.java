package com.xch.designMode.ciglibProxy;


import com.xch.designMode.jdkproxy.UserDaoImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *
 * 代理模式（ciglib）
 * @author xiech
 * @create 2020-01-08 11:16
 */
public class CiglibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target){
        this.target=target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("22开启事务");
        Object invoke=methodProxy.invoke(target,objects);
        System.out.println("22提交事务");
        return invoke;
    }

    public static void main(String[] args) {
        CiglibProxy ciglibProxy=new CiglibProxy();
        UserDaoImpl userDao= (UserDaoImpl) ciglibProxy.getInstance(new UserDaoImpl());
        userDao.add();
    }
}
