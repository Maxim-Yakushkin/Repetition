package com.yakushkin.repetition.lesson_25_11_Thread_Deadlock;

public class AccountThread extends Thread {

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) { // при 20 итерацих работает норм, а при 2000 - виснет. DeadLock!
            synchronized (accountFrom) {
                synchronized (accountTo) {
                    if (accountFrom.takeOffMoney(10)) {
                        accountTo.addMoney(10);
                    }
                }
            }
        }
    }
}
