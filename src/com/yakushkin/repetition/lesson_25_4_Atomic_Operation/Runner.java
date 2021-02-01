package com.yakushkin.repetition.lesson_25_4_Atomic_Operation;

/**
 * 3. В методе main создать 4 потока типа CounterThread,
 * передав один и тот же объект Counter и запустить их, дождаться выполнения
 * и вывести на консоль в текущее значение нашего счетчика:
 * counter.getCount()
 */
public class Runner {

    /**
     * count++
     *
     * 1. считывание
     * 2. изменение
     * 3. запись
     *
     * ----- 8 -> 8 + 1 -> count -> 9 \
     *                                 потеряна одна операция, т.к. два потока считали, изменили и записали одно и то же значение параллельно
     * ----- 8 -> 8 + 1 -> count -> 9 /
     */
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread first = new Thread(new CounterThread(counter));
        Thread second = new Thread(new CounterThread(counter));
        Thread third = new Thread(new CounterThread(counter));
        Thread fourth = new Thread(new CounterThread(counter));

        first.start();
        second.start();
        third.start();
        fourth.start();

        try {
            first.join();
            second.join();
            third.join();
            fourth.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
