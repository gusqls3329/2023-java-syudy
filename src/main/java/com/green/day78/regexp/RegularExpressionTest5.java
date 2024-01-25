package com.green.day78.regexp;

import java.util.regex.Pattern;

//전화번호 정규표현식
public class RegularExpressionTest5 {
    public static void main(String[] args) {
        String str1 = "010-1234-1234";
        String str2 = "011-123-1234";
        String str3 = "016-12345-1234";
        String str4 = "017-123-123";
        String str5 = "018-123-12345";
        String str6 = "0197-123-1234";
        String regexp = "^01[0-1|6-9]{1}-[\\d]{3,4}-[\\d]{4}$";

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str4));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str5));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str6));
    }
}
