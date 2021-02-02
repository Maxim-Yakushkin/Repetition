package com.yakushkin.repetition.lesson_25_12_Thread_Practice;

import java.util.Queue;

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();
                    System.out.println("consumer get value: " + removedValue + ". Size " + list.size());
                } else {
                    System.out.println("consumer is waiting, list is empty");
                }
                try {
                    int randomInt = RandomUtil.getRandomInt();
                    System.out.println("consumer wait: " + randomInt);
                    list.notifyAll();
                    list.wait(randomInt);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
