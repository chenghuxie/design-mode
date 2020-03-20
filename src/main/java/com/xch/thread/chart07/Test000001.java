package com.xch.thread.chart07;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiech
 * @create 2020-01-03 10:01
 */
public class Test000001 extends Thread{

    private  static int COUNT=1;

    AtomicInteger atomicInteger=new AtomicInteger();

    @Override
    public void run() {
        while (true){
            Integer count=getCount();
            if(count>170){
                break;
            }
            System.out.println(count);
        }
    }

    public synchronized Integer getCount(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return atomicInteger.getAndAdd(1);
    }

    /**
     * 不同步  两个锁对象
     * @param args
     */
    public static void main(String[] args) {
        Test000001 test000001=new Test000001();
        Test000001 test000002=new Test000001();
        test000001.start();
        test000002.start();

    }
}
