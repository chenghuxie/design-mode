package com.xch.jvm.javaasist;

import javassist.ClassPool;

/**
 * @author xiech
 * @create 2020-01-15 10:17
 */
public class Test2 {
    public static void main(String[] args) {
        ClassPool pool = ClassPool.getDefault();
        pool.makeClass("com.xch.jvm.javaasist.User");

    }
}
