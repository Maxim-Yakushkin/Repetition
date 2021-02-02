package com.yakushkin.repetition.lesson_25_12_Thread_Practice;

import java.util.Queue;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    int randomInt = RandomUtil.getRandomInt();
                    list.add(randomInt);
                    System.out.println("producer adds value: " + randomInt + ". Size " + list.size());
                } else {
                    System.out.println("producer does nothing");
                }
                list.notifyAll();
                try {
                    int randomInt1 = RandomUtil.getRandomInt();
                    System.out.println("producer waits: " + randomInt1);
                    list.wait(randomInt1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
