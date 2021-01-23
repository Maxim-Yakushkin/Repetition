package com.yakushkin.repetition.lesson_19_13_Collection_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>(); // хранит только уникальные элементы (без порядка)
        System.out.println(set.add("aaa"));
        System.out.println(set.add("bbb"));
        System.out.println(set.add("ccc"));
        System.out.println(set.add("ddd"));
        System.out.println(set.add("aaa"));

        System.out.println(set.getClass().getSimpleName() + " : " + set);

        Set<Object> linkedSet = new LinkedHashSet<>(); // хранит только уникальные элементы (в том порядке в котором были помещены)
        System.out.println(linkedSet.add("aaa"));
        System.out.println(linkedSet.add("bbb"));
        System.out.println(linkedSet.add("ccc"));
        System.out.println(linkedSet.add("ddd"));
        System.out.println(linkedSet.add("aaa"));

        System.out.println(linkedSet.getClass().getSimpleName() + " : " + linkedSet);

        Set<Object> treeSet = new TreeSet<>(); // хранит только уникальные элементы (отсортирован)
        System.out.println(treeSet.add("ddd"));
        System.out.println(treeSet.add("ccc"));
        System.out.println(treeSet.add("bbb"));
        System.out.println(treeSet.add("aaa"));
        System.out.println(treeSet.add("aaa"));

        System.out.println(treeSet.getClass().getSimpleName() + " : " + treeSet);
    }
}
