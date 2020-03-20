package com.xch.thread.chart04;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xiech
 * @create 2019-12-31 15:13
 */
public class Test0005 {


    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(1,2,0L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(3));
        threadPoolExecutor.execute(new TaskThread1("1"));
        threadPoolExecutor.execute(new TaskThread1("2"));
        threadPoolExecutor.execute(new TaskThread1("3"));
    }


}
class TaskThread1 implements Runnable{
    private String name;

    public TaskThread1(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}
