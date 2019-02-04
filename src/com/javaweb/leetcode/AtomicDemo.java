package com.javaweb.algorithm;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class AtomicDemo {
    public static void main(String[] args){
        TestAtomicDemo test = new TestAtomicDemo();
        for(int i = 0; i < 10; i ++){
            new Thread(test).start();
        }
    }

}


class TestAtomicDemo implements Runnable {
    private AtomicInteger number = new AtomicInteger();

    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        System.out.println(Thread.currentThread().getName()+":"+ getNumber());
    }

    public int getNumber() {
        return number.getAndIncrement();
    }
}
