package com.yakushkin.repetition.lesson_25_4_Atomic_Operation;

/**
 * 1. Создать класс Counter с одним полем:
 * private int count;
 * <p>
 * Добавить методы:
 * - getCount() - для получение поля count
 * - increment() - для увеличения значения поля на единицу
 * - decrement() - для уменьшения значения поля на единицу
 */
public class Counter {

    public int count;

    public int getCount() {
        return count;
    }

    // synchronized говрит о том, что! Толкьо один поток в один и тот же момент времени может использовать этот метод
    public void increment() {
        synchronized (this) {
            count++;
        }
    }

//    // synchronized говрит о том, что! Толкьо один поток в один и тот же момент времени может использовать этот метод
//    public synchronized void increment() {
//            count++;
//    }

    public void decrement() {
        count--;
    }
}
