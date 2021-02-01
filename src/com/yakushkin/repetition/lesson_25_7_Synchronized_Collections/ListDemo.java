package com.yakushkin.repetition.lesson_25_7_Synchronized_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> integers = Collections.synchronizedList(new ArrayList<>()); // используется синхронизированная оболочка для коллекций

        Thread listThread1 = new Thread(new ListThread(integers));
        Thread listThread2 = new Thread(new ListThread(integers));
        Thread listThread3 = new Thread(new ListThread(integers));
        Thread listThread4 = new Thread(new ListThread(integers));
        Thread listThread5 = new Thread(new ListThread(integers));
        Thread listThread6 = new Thread(new ListThread(integers));
        Thread listThread7 = new Thread(new ListThread(integers));

        listThread1.start();
        listThread2.start();
        listThread3.start();
        listThread4.start();
        listThread5.start();
        listThread6.start();
        listThread7.start();

        try {
            listThread1.join();
            listThread2.join();
            listThread3.join();
            listThread4.join();
            listThread5.join();
            listThread6.join();
            listThread7.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(integers.size());
    }
}
