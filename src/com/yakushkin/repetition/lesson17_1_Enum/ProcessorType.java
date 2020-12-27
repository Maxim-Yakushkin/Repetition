package com.yakushkin.repetition.lesson17_1_Enum;

public enum ProcessorType implements Describable {
    BIT_32("bit-32"),
    BIT_64("bit-64");

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name + " Description";
    }

    public String getName() {
        return name;
    }
}
