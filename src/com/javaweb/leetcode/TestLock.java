package com.javaweb.algorithm;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args){
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        new Thread(t1,"一号窗口").start();
        new Thread(t1,"二号窗口").start();
        new Thread(t1,"三号窗口").start();
    }
}
class Ticket implements Runnable{
    private int ticket = 100;

    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        lock.lock();
        try {
            while(true){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName()+":"+ ticket--);
                }
            }
        } finally {
            lock.unlock();
        }

    }
}