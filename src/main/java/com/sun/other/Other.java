package com.sun.other;

import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;

/**
 * @ClassName Other
 * @Description TODO
 * Author sunhong
 * Date 2020-7-8 16:17
 **/
public class Other {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(5);

        Stream.of("task1","task2","task3","task4").forEach(threadname->{
            new Thread(threadname){
                @Override
                public void run() {
                    Optional.of("currentThread:"+Thread.currentThread().getName()).ifPresent(System.out::println);
                    countDownLatch.countDown();

                }
            }.start();
        });
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName());
    }
}
