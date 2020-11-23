package com.yakushkin.repetition.lesson10_3_StrinfBuilder;

public class Runner {
    public static void main(String[] args) {

        long startTimeString = System.currentTimeMillis();
        String valueString = "";
        for (int i = 0; i < 100_000; i++) {
            valueString += i;
        }
        long endTimeString = System.currentTimeMillis();
        System.out.println("Time for String: " + (endTimeString - startTimeString));

//        --------------------------------------------------------------------------------------------------------------

        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder valueStringBuilder = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            valueStringBuilder.append(i);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("Time for StringBuilder: " + (endTimeStringBuilder - startTimeStringBuilder));


    }
}
