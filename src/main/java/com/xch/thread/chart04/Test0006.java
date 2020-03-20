package com.xch.thread.chart04;

import java.util.concurrent.*;

/**
 * @author xiech
 * @create 2019-12-31 16:43
 */
public class Test0006 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService=Executors.newCachedThreadPool();
        Future<String> future=executorService.submit(new TaskThread());
        System.out.println("主");
        new Thread(new Runnable() {
            @Override
            public void run() {
                String res= null;
                try {
                    res = future.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                System.out.println(res);
            }
        }).start();
        System.out.println("主");
    }
}
class TaskThread implements Callable<String>{
    @Override
    public String call() throws Exception {
        System.out.println("开始");
        Thread.sleep(5000);
        System.out.println("结束");
        return "xch";
    }
}
