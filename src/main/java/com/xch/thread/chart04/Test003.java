package com.xch.thread.chart04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xiech
 * @create 2019-12-31 14:28
 */
public class Test003 {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newCachedThreadPool();
        for (int i=0;i<10;i++){
            final int temp=i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+","+temp);
                }
            });
        }
        executorService.shutdown();
    }
}
