package com.yakushkin.repetition.lesson_26_9_Semaphore_CASHBOX_3;

import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {

    private final Semaphore cashBoxes;

    public BuyerThread(Semaphore cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {
            cashBoxes.acquire(); // по сути получаем (захватываем) монитор

            System.out.println(Thread.currentThread().getName() + " обслуживается в какой-то кассе");
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " освобождаю какую-то кассу ");

            cashBoxes.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
