package com.yakushkin.repetition.lesson_26_9_Semaphore_CASHBOX_3;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CashBoxRunner {

    public static void main(String[] args) throws InterruptedException {
//        List<CashBox> cashBoxList = List.of(new CashBox(), new CashBox(), new CashBox());
//        BlockingQueue<CashBox> cashBoxes = new ArrayBlockingQueue<>(cashBoxList.size(), true, cashBoxList);

        Semaphore cashBoxes = new Semaphore(2); // 2 как бы количество касс


        List<Thread> threads = Stream.of(
                new BuyerThread(cashBoxes),
                new BuyerThread(cashBoxes),
                new BuyerThread(cashBoxes),
                new BuyerThread(cashBoxes),
                new BuyerThread(cashBoxes),
                new BuyerThread(cashBoxes),
                new BuyerThread(cashBoxes),
                new BuyerThread(cashBoxes)
        )
                .map(Thread::new)
                .peek(Thread::start)
                .collect(Collectors.toList());

        for (Thread thread : threads) {
            thread.join();
        }
    }
}
