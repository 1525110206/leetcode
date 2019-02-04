package com.javaweb.algorithm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args){
        ThreadDemo threadDemo = new ThreadDemo();
        FutureTask<Integer> result = new FutureTask<>(threadDemo);
        new Thread(result).start();
        try {
            Integer sum = result.get();
            System.out.println(sum);
            System.out.println("-----------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}


class ThreadDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 0; i < 10; i ++){
            sum += i;
        }
        return sum;
    }
}
