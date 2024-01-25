package com.green.day78.regexp;

import java.util.regex.Pattern;
//이메일 정규표현식
public class RegularExpressionTest4 {
    public static void main(String[] args) {
        String str1 = "abc@naver.com";
        String str2 = "abc@naver.co.kr";
        String str3 = "ab_c@naver.co.kr";
        String str4 = "11ㄱ11";
        String regexp = "^[a-zA-Z0-9]+@([a-zA-Z0-9]{3,}\\.[a-z]+)$"; //abc@naver.com
        String regexp2 = "^[a-zA-Z0-9]+@([a-zA-Z0-9]{3,}\\.[a-z]+|[a-zA-Z0-9]{3,}\\.[a-z]+\\.[a-z]+)$"; // abc@naver.co.kr
        String regexp3 = "^[a-zA-Z0-9-_]+@([a-zA-Z0-9]{3,}\\.[a-z]+|[a-zA-Z0-9]{3,}\\.[a-z]+\\.[a-z]+)$";// abc@naver.co.kr + 메일 @앞(abc부분)_or-가 가능

        System.out.printf("%s > %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s > %b\n", str2, Pattern.matches(regexp2, str2));
        System.out.printf("%s > %b\n", str3, Pattern.matches(regexp3, str3));

    }
}
