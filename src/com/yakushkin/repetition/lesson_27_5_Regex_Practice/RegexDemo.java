package com.yakushkin.repetition.lesson_27_5_Regex_Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        // 3. Написать программу, выполняющую поиск в строке всех тегов
        // абзацев, в т.ч. тех, у которых есть параметры, например <p id="p1">,
        // и замену их на простые теги абзацев <p>.
        String regex = "(<p .+?>)(.+?</p>)"; // здесь ? - ленивый квантификатор
        String input = "<p>sfrgreg dfgrth</p> <b> erg </b> drthfgf ergdfg <p id=\"p1\">sdfg rrgf</p>" +
                "sdfghgdfh <p> dfgr dffgrt <p id=\"p2\">3523 fg</p> dfg";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }

    private static void task2() {
        // 2. Написать программу, выполняющую поиск в строке
        // шестнадцатеричных чисел, записанных по правилам Java,
        // с помощью регулярных выражений и выводящую их на страницу.
        String regex = "0[Xx][0-9a-fA-F]+";
        String string = "hkh 0Xff egrsdfh 0x12 dfghd 0XAB jtyjkfg 1x24F dfghf fgt 0TaC";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void task1() {
        // 1. Написать программу, проверяющую, является ли введённая
        // строка адресом почтового ящика. В названии почтового ящика разрешить использование
        // только букв, цифр и нижних подчёркиваний, при этом оно должно начинаться с буквы.
        // Возможные домены верхнего уровня: .org .com
        String email = "max-yakushkin1@yandex.ru";
        String regex = "[a-zA-Z]+-?\\.?\\w*@\\w{3,}\\.(org|com|ru)";
        boolean matches = Pattern.matches(regex, email);
        System.out.println(matches);
    }
}
