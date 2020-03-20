package com.xch.thread.chart04;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiech
 * @create 2019-12-31 13:37
 */

class ProducerThread implements Runnable{
    public BlockingQueue<String> blockingQueue;

    public volatile boolean FLAG=true;

    AtomicInteger atomicInteger=new AtomicInteger();

    public ProducerThread(BlockingQueue<String> blockingQueue){
        this.blockingQueue=blockingQueue;
    }

    @Override
    public void run() {
        System.out.println("###生产者已启动####");
        try {
        while (FLAG){
            String data=atomicInteger.incrementAndGet()+"";

                boolean b1=blockingQueue.offer(data,2,TimeUnit.SECONDS);
                if (b1){
                    System.out.println("生产者存入成功！data:"+data);
                }else {
                    System.out.println("生产者存入失败！data:"+data);
                }
              Thread.sleep(1000);
        }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("生产者已经结束！");
        }
    }

    public void stop(){
        this.FLAG=false;
    }
}


class ConsumerThread implements Runnable{

    public BlockingQueue<String> blockingQueue;

    public volatile boolean FLAG=true;

    AtomicInteger atomicInteger=new AtomicInteger();

    public ConsumerThread(BlockingQueue<String> blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {
        System.out.println("消费者已启动！");
        try {
            while (FLAG){
                String data=blockingQueue.poll(2,TimeUnit.SECONDS);
                if(data==null){
                    System.out.println("超过2秒没有取到值！");
                    FLAG=false;
                    return;
                }
                System.out.println("消费者获取data:"+data);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("消费者已结束！");
        }
    }
}
public class Test0002 {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue=new LinkedBlockingQueue<>(10);
        ProducerThread producerThread=new ProducerThread(blockingQueue);
        ConsumerThread consumerThread=new ConsumerThread(blockingQueue);
        Thread p1=new Thread(producerThread);
        Thread c1=new Thread(consumerThread);
        p1.start();
        c1.start();
        try {
            Thread.sleep(1000*10);
        }catch (Exception e){
            e.printStackTrace();
        }
        producerThread.stop();

    }
}
