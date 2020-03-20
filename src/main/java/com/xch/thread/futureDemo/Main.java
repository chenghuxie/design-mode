package com.xch.thread.futureDemo;

/**
 * @author xiech
 * @create 2019-12-31 18:09
 */
public class Main {
    public static void main(String[] args) {
        FutureClient futureClient=new FutureClient();
        Data res=futureClient.request("xxxx");
        System.out.println("请求发送成功！");
        System.out.println("执行其他任务！");
        String resq=res.getRes();
        System.out.println(resq);
    }
}
