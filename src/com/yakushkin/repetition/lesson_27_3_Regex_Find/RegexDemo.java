package com.yakushkin.repetition.lesson_27_3_Regex_Find;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        String phoneNumber = "fhdrth +375 (29) 305-20-33 ghdrth dfgherth +375 (33) 620-91-97 sdfgh rthfh" +
                " +375 (44) 684-20-75 fdhdt jgjty  +375 (25) 356-45-87 dfghj";
        String regex1 = "(\\+375)\\s\\((29|33|44|25)\\)\\s\\d{3}-\\d{2}-\\d{2}";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(phoneNumber);

        while (matcher1.find()) {
            System.out.print(matcher1.group());
            System.out.println(" (код: " + matcher1.group(2) + ")"); // int group это как бы индекс группы в регулярном выражении. Группа перется в круглые скобки
        }

        System.out.println("-----------------------------------------------------");

        String regex2 = "(\\+375)\\s\\((?<code>\\d{2})\\)\\s\\d{3}-\\d{2}-\\d{2}";

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(phoneNumber);

        while (matcher2.find()) {
            System.out.print(matcher2.group());
            System.out.println(" (код: " + matcher2.group("code") + ")");
        }
    }
}
