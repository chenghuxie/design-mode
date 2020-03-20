package com.xch.thread.futureDemo;

/**
 * @author xiech
 * @create 2019-12-31 18:07
 */
public class FutureClient {
    public Data request(String data){
        FutureData futureData=new FutureData();
        new Thread(new Runnable() {
            @Override
            public void run() {
                RealData realData=new RealData(data);
                futureData.setRealData(realData);
            }
        }).start();
        return futureData;
    }
}
