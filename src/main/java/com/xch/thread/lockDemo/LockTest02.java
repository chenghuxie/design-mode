package com.xch.thread.lockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xiech
 * @create 2020-01-02 9:47
 */
public class LockTest02 implements Runnable {
    Lock lock=new ReentrantLock();

    @Override
    public void run() {
        set();
    }

    public  void set(){
        try {
            lock.lock();
            System.out.println("set");
            get();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
    public  void get(){
        try {
            lock.lock();
            System.out.println("get");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        LockTest02 lockTest01=new LockTest02();
        Thread t1=new Thread(lockTest01);
        t1.start();
    }
}
