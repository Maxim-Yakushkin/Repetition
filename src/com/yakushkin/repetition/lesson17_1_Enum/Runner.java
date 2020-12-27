package com.yakushkin.repetition.lesson17_1_Enum;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        ProcessorType bit32 = ProcessorType.BIT_32;
        System.out.println(bit32);
        System.out.println(bit32.name());
        System.out.println(ProcessorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(ProcessorType.BIT_32.ordinal());
        System.out.println(ProcessorType.BIT_64.ordinal());
        System.out.println(ProcessorType.BIT_64.getName());

        System.out.println(bit32.getDescription());
    }
}
