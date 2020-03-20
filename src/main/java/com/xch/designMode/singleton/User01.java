package com.xch.designMode.singleton;

/**
 *
 * 饿汉式
 * @author xiech
 * @create 2020-01-03 16:54
 */
public class User01 {
    private static final User01 USER_01=new User01();

    private User01(){}

    public static User01 getInstance(){
        return USER_01;
    }

    public static void main(String[] args) {
        User01 t1 = User01.getInstance();
        User01 t2 = User01.getInstance();
        System.out.println(t1==t2);
    }
}
