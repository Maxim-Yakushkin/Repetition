package com.yakushkin.repetition.lesson_27_4_Regex_Substring_Replace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        String phoneNumber = "fhdrth +375 (29) 305-20-33 ghdrth dfgherth +375 (33) 620-91-97 sdfgh rthfh" +
                " +375 (44) 684-20-75 fdhdt jgjty  +375 (25) 356-45-87 dfghj";
        String regex = "(\\+375)\\s\\((?<code>\\d{2})\\)\\s(\\d{3})-(\\d{2})-(\\d{2})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        StringBuilder stringBuilder = new StringBuilder();

        while (matcher.find()) {
//            String group1 = matcher.group(2);
//            String group2 = matcher.group(3);
//            String group3 = matcher.group(4);
//            matcher.appendReplacement(stringBuilder, group1 + " - " + group2 + " - " + group3);
            matcher.appendReplacement(stringBuilder, "$2 - $3 - $4");
        }
        matcher.appendTail(stringBuilder); // сохраняет конец строки

        System.out.println(stringBuilder);
        System.out.println(phoneNumber.replaceAll(regex,"$2 - $3 - $4 |"));
    }
}
