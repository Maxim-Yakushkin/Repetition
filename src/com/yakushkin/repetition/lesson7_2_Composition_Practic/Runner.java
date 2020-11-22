package com.yakushkin.repetition.lesson7_2_Composition_Practic;

public class Runner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(5, 30, 50);
        System.out.println(timeInterval.totalSeconds());

        TimeInterval timeInterval2 = new TimeInterval(timeInterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());

        timeInterval.printInfo();
        timeInterval2.printInfo();

        TimeInterval newTimeInterval = timeInterval.plus(timeInterval2);
        newTimeInterval.printInfo();
    }
}
