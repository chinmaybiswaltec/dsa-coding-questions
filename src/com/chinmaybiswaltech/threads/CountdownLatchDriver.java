package com.chinmaybiswaltech.threads;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchDriver {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        MyRunnable myRunnable = new MyRunnable(countDownLatch);
        System.out.println("Waiting on countdown latch");
        new Thread(myRunnable).start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread ENDED");
    }
}
