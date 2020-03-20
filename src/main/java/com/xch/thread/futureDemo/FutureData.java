package com.xch.thread.futureDemo;

/**
 * @author xiech
 * @create 2019-12-31 17:22
 */
public class FutureData extends Data {
    private boolean FLAG=false;

    private RealData realData;

    public synchronized void setRealData(RealData realData){
        if(FLAG){
            return;
        }
        this.realData=realData;
        FLAG=true;
        notify();
    }

    @Override
    public synchronized String getRes() {
        while (!FLAG){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return realData.getRes();
    }
}
