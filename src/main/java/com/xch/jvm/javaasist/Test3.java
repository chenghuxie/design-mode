package com.xch.jvm.javaasist;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author xiech
 * @create 2020-01-15 10:38
 */
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> forName = Class.forName("com.xch.jvm.javaasist.Test3");
        Method method = forName.getDeclaredMethod("sum", int.class, int.class);
        Object newInstance=forName.newInstance();
        method.invoke(newInstance,1,5);

    }
    public static void sum(int a,int b){
        System.out.println("sum:"+(a+b));
    }
}
