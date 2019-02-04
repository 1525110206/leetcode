package com.javaweb.algorithm;

import sun.util.resources.th.CalendarData_th;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

import static java.lang.Thread.sleep;

public class AlternateDemo {
    public static void main(String[] args){
        /*Temp temp = new Temp();
        Thread thread = new Thread(temp);
        thread.start();
        while (true){
            if(temp.isFlag()){
                System.out.println("-----------");
                break;
            }
        }*/
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

    }
}

class Temp implements Runnable{
    private volatile boolean flag = false;
    @Override
    public void run() {

        /*try {
            sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        flag = true;
        if(flag){
            System.out.println("flag = " + isFlag());
        }

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
