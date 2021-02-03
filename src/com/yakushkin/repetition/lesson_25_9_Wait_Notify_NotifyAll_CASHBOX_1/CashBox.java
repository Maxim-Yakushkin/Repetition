package com.yakushkin.repetition.lesson_25_9_Wait_Notify_NotifyAll_CASHBOX_1;

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
