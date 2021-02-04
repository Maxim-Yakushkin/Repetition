package com.yakushkin.repetition.lesson_27_2_Regex_Pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        String regex = "^\\+375\\s\\((29|33|44|25)\\)\\s\\d{3}-\\d{2}-\\d{2}$";
        String phoneNumber1 = "+375293052033";
        String phoneNumber2 = "+375 (29) 305-20-33";

        Pattern pattern = Pattern.compile(regex);

//        Matcher matcher = pattern.matcher(phoneNumber1); // false
//        Matcher matcher1 = pattern.matcher(phoneNumber2); // true

//        System.out.println(matcher.matches());
//        System.out.println(matcher1.matches());

        System.out.println(Pattern.matches(regex, phoneNumber1)); // false
        System.out.println(Pattern.matches(regex, phoneNumber2)); // true
    }
}
