package com.xch.thread.lockDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;


/**
 * @author xiech
 * @create 2020-01-02 9:47
 * jvm  内置缓存
 *
 */
public class LockTest03 {
   private volatile Map<String,String> cache=new HashMap<>();
   private ReentrantReadWriteLock.WriteLock writeLock;

   public  void put(String key,String value){
       try {
           System.out.println("写开始key"+key+"value:"+value);
           Thread.sleep(50);
           cache.put(key,value);
           System.out.println("写结束key"+key+"value:"+value);
       }catch (Exception e){

       }
   }
   public  String get(String key){
       try {
           System.out.println("读开始key"+key);
           Thread.sleep(50);
           String value=cache.get(key);
           System.out.println("读结束key"+key+"value:"+value);
           return value;
       }catch (Exception e){
           e.printStackTrace();
           return null;
       }

   }

    public static void main(String[] args) {
       LockTest03 lockTest03=new LockTest03();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    lockTest03.put(i+"",i+"");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    lockTest03.get(i+"");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
