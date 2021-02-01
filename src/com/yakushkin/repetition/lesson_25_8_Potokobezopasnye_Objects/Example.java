package com.yakushkin.repetition.lesson_25_8_Potokobezopasnye_Objects;

import java.util.ArrayList;
import java.util.List;

public class Example {

    private List<Integer> list;

    public Example(List<Integer> list) {
        this.list = List.copyOf(list);
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }
}
