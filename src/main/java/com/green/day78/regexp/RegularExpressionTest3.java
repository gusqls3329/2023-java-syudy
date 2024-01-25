package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest3 {
    public static void main(String[] args) {
        String str1 = "하하";
        String str2 = "하하12";
        String str3 = "1111";
        String str4 = "11ㄱ11";
        String regexp = "^([가-힣]+[0-9]*)$"; // == String regexp = "^[a-zA-Z]*$";
        String regexp2 = "^([ㄱ-ㅎㅏ-ㅣ가-힣0-9 ]+[0-9]*)$";

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str4, Pattern.matches(regexp2, str4));

    }
}
