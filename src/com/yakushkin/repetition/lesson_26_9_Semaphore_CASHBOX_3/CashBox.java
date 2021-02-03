package com.yakushkin.repetition.lesson_26_9_Semaphore_CASHBOX_3;

public class CashBox {

    private static int generator = 1;
    private int id;

    public CashBox() {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "CashBox{" +
                "id=" + id +
                '}';
    }
}
