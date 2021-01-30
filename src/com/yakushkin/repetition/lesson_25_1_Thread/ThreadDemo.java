package com.yakushkin.repetition.lesson_25_1_Thread;

public class ThreadDemo {

    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        simpleThread.start();
        try {
            simpleThread.join(); // join() говорит о том, что мы не перейдем на строчку 10 до тех пор, пока simpleThread не закончит свое выполнение
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        simpleThread.interrupt(); // останавливает поток тогда, когда у него повится такая возможность
        System.out.println(Thread.currentThread().getName());
    }
}
