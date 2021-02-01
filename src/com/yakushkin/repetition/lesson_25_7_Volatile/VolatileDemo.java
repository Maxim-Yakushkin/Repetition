package com.yakushkin.repetition.lesson_25_7_Volatile;

public class VolatileDemo {

    // volatile говорит о том, что не нужно использовать никаких оптимизаций (например кэширование поля).
    // Мы всегда должны сохранять и получать информацию из RAM.
    // volatile можно применять только к примитивным типам и ссылкам
    private static volatile boolean flag;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("still false");
            }
        });
        thread1.start();

        Thread.sleep(5L);

        Thread thread2 = new Thread(() -> {
            flag = true;
            System.out.println("flag is set true");
        });
        thread2.start();
    }
}
