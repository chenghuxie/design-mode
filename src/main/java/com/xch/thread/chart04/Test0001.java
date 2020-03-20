package com.xch.thread.chart04;

import java.util.concurrent.*;

/**
 * @author xiech
 * @create 2019-12-31 10:21
 */
public class Test0001 {
    public static void main(String[] args) throws InterruptedException {
 /*       ConcurrentLinkedQueue<String> concurrentLinkedQueue=new ConcurrentLinkedQueue<>();
        concurrentLinkedQueue.offer("张三");
        concurrentLinkedQueue.offer("李四");
        concurrentLinkedQueue.offer("王五");
        System.out.println(concurrentLinkedQueue.poll());
        System.out.println(concurrentLinkedQueue.size());
        System.out.println(concurrentLinkedQueue.poll());
        System.out.println(concurrentLinkedQueue.size());
        System.out.println(concurrentLinkedQueue.poll());
        System.out.println(concurrentLinkedQueue.size());
        System.out.println(concurrentLinkedQueue.poll());
        System.out.println(concurrentLinkedQueue.size());*/


        BlockingQueue blockingQueue=new ArrayBlockingQueue(3);
        blockingQueue.offer("张三");
        blockingQueue.offer("李四",3,TimeUnit.SECONDS);
        System.out.println(blockingQueue.poll());
        System.out.println(blockingQueue.poll());
    }
}
