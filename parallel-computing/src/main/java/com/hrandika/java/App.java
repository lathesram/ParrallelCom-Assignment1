package com.hrandika.java;

import java.lang.Math;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    //creating random sleep time. 
                    long r = (long) (Math.random() * (10) + 1);
                    long r_milli = r * 1000;

                    System.err.println("Thread id " + Thread.currentThread().getId() + " Sleep time " + r);

                    try {
                        Thread.sleep(r_milli);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                   
                }
            }).start();
        }
    }
}
