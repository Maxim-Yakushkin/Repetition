package com.yakushkin.repetition.lesson10_2_String_Practic;

/**
 * 3. Написать функцию, принимающую в качестве параметров имя, фамилию и
 * отчество и возвращающую инициалы
 *     в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
 * регистре, а результирующая строка должна быть в верхнем.
 */
public class Task3 {
    public static void main(String[] args) {
        String name = "Maxim";
        String lastName = "Yakushkin";
        String secondName = "Eugenievich";

        String fio = fio(name, lastName, secondName);
        System.out.println(fio);
    }

    private static String fio(String name, String lastName, String secondName) {
        String f = String.valueOf(lastName.charAt(0));
        String i = String.valueOf(name.charAt(0));
        String o = String.valueOf(secondName.charAt(0));

        return String.format("%s.%s.%s", f.toUpperCase(), i.toUpperCase(), o.toUpperCase());
    }
}
