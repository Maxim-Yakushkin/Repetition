package com.yakushkin.repetition.lesson_26_4_ThreadPool_Future_Callable;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
        threadPool.scheduleAtFixedRate(() -> System.out.println("OK!"), 2L, 4L, TimeUnit.SECONDS); // выполняет задачу с периодичностью в 2 секунды

//        threadPool.shutdown(); // останавливает пул потоков, когда все задачи будут выполнены
//        threadPool.awaitTermination(1L, TimeUnit.HOURS); // время ожидания после вызова shutdown(). Т.е. если за 1ч не все задачи выполнятся, то пул потоков будет закрыт
    }

    private static void test1() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        // future - ожидаемый результат выполнения потока, котрый можно получить и выполнять с ним нужные действия, еще до завершения потока
        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2000L);
            System.out.println("Its callable");
            return 1;
        });

        System.out.println("result: " + future.get());

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");
    }
}
