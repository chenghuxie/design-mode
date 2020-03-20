package com.xch.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiech
 * @create 2020-01-13 13:30
 */
public class Test001 {
    public static void main(String[] args) {
        List<Object> list=new ArrayList<>();
        for (int  i=0;i<10;i++){
            byte[] b=new byte[1*1024*1024];
            list.add(b);
        }
        System.out.println("添加成功！");
       /* System.out.println("最大内存"+Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println("可以内存"+Runtime.getRuntime().freeMemory()/1024/1024);
        System.out.println("已经使用内存"+Runtime.getRuntime().totalMemory()/1024/1024);*/
    }
}
