package com.yakushkin.repetition.lesson_25_2_Runnable;

public class RunnableDemo {

    public static void main(String[] args) {
        var runnableThread = new Thread(new SimpleRunnable(), "RunnableThread");
        var lambdaThread = new Thread(() -> System.out.println("Hello from " + RunnableDemo.class.getSimpleName()), "LambdaThread");

        System.out.println("сотсояние " + runnableThread.getName() + " после создания: " + runnableThread.getState());

        runnableThread.start();

        System.out.println("сотсояние " + runnableThread.getName() + " после вызова start(): " + runnableThread.getState());

        lambdaThread.start();
        try {
            runnableThread.join(); // при вызове join() главный поток main ждет пока runnableThread закончит свое выполнеие и потом переходит на строчку 13
            System.out.println("сотсояние " + runnableThread.getName() + " после вызова join() и выполнения: " + runnableThread.getState());
            lambdaThread.join(); // при вызове join() главный поток main ждет пока lambdaThread закончит свое выполнеие и потом переходит на строчку 14
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
