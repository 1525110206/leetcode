package com.javaweb.algorithm;

import java.util.Random;
import java.util.concurrent.*;

public class TestScheduledThreadPool {
    public static void main(String[] args){
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        for(int i = 0; i < 5; i ++){
            Future<Integer> result = pool.schedule(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = new Random().nextInt(100);
                    System.out.println(Thread.currentThread().getName()+":"+sum);
                    return sum;
                }
            },1,TimeUnit.SECONDS);
            System.out.println(result);
        }
        pool.shutdown();
    }
}
