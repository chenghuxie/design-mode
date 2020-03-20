package com.xch.thread.chart04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xiech
 * @create 2019-12-31 14:40
 */
public class Test0004 {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool(3);
        for (int i=0;i<10;i++){
            final int temp=i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {

                        Thread.sleep(1000);
                    }catch (Exception e){

                    }
                    System.out.println(Thread.currentThread().getName()+","+temp);
                }
            });
        }
        executorService.shutdown();
    }
}
