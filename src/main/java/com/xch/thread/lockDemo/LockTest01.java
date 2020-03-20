package com.xch.thread.lockDemo;

/**
 * @author xiech
 * @create 2020-01-02 9:47
 */
public class LockTest01 implements Runnable {
    @Override
    public void run() {
        set();
    }

    public synchronized void set(){
        System.out.println("set");
        get();
    }
    public synchronized void get(){
        System.out.println("get");
    }

    public static void main(String[] args) {
        LockTest01 lockTest01=new LockTest01();
        Thread t1=new Thread(lockTest01);
        t1.start();
    }
}
