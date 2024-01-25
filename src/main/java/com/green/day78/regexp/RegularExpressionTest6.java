package com.green.day78.regexp;

import java.util.regex.Pattern;

//주민등록번호 정규표현식
public class RegularExpressionTest6 {
    public static void main(String[] args) {
        String str1 = "991203-1234567";
        String str2 = "991203-12345678";
        String str3 = "016-12345-1234";

        String regexp ="^\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|[3][01])\\-[1-4][0-9]{6}$";

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp, str3));

    }
}
