package com.chinmaybiswaltech.threads;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable{
    CountDownLatch countDownLatch;

    MyRunnable(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run() {
        for(int i=2;i>=0;i--){
            System.out.println("Count down is "+i);
            countDownLatch.countDown();
        }
    }
}
