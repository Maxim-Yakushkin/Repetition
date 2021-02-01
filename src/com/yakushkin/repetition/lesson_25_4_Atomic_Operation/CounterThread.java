package com.yakushkin.repetition.lesson_25_4_Atomic_Operation;

/**
 * 2. Создать класс CounterThread c одним полем и конструктором для инициализации:
 * private Counter counter;
 * <p>
 * В методе run этого класса в цикле 100 раз вызвать counter.increment()
 */
public class CounterThread implements Runnable {

    public Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
        }
    }
}
