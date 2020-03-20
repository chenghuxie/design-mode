package com.xch.thread.futureDemo;


/**
 * @author xiech
 * @create 2019-12-31 17:29
 */
public class RealData extends Data {

    private String result;

    public RealData(String data){
        System.out.println("正在使用data:"+data+"网络请求数据，耗时操作");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("操作完毕！");
        result="xch";
    }

    @Override
    public String getRes() {

        return result;
    }
}
