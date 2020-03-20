package com.xch.designMode.singleton;

/**
 * 懒汉式
 * @author xiech
 * @create 2020-01-06 10:33
 */
public class User02 {

    private static User02 user02;

    private User02(){

    }

    private static synchronized User02 getInstance(){
        if(user02==null){
            user02=new User02();
        }
        return user02;
    }

    public static void main(String[] args) {
        User02 t1 = User02.getInstance();
        User02 t2 = User02.getInstance();
        System.out.println(t1==t2);
    }

}
