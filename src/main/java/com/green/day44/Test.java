package com.green.day44;

public class Test {
    // 체이닝 기법 :
    public static void main(String[] args){
        MyInfo mi = new MyInfo()
                .title("ddd")
                .description("인스타 클론 코딩");
        MyInfo mi2 = mi.title("ggg");

        System.out.println(mi==mi2);
        mi.description("zzz");
        System.out.println(mi);
        MyOpenAPI moa = new MyOpenAPI().info(mi);
        System.out.println(moa);
    }
}
