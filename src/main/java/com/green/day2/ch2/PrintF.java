package com.green.day2.ch2;

public class PrintF {
    public static void main(String[] args){
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("--------------");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.println("Hello\n");
        System.out.println("--------------");
        System.out.print("Helo\n"); //이스케이프 : 개행
        System.out.print("Helo\n");
        System.out.print("Helo\n");

        String name ="홍길동";
        int age = 23;
        char bloodType = 'B';
        float height = 178.8f;

        System.out.println("제 이름은 "+ name+ "이고, 나이는 "+age+"살이고, "+ "혈액형은 "+bloodType+"형이고," + " 키는 "+ height + "cm입니다." );

        System.out.printf("제 이름은 %s이고, 나이는 %d세이고, 혈액형은 %c형이고, 키는 %fcm입니다.\n", name, age, bloodType, height);
        //책p37참고 ,, %3d : 나이는  23세이고,  %03d :나이는 023세이고
        //f는 실수 변경가능 , %.1f : 178.8
        System.out.printf("제 이름은 %s이고, 나이는 %s세이고, 혈액형은 %s형이고, 키는 %scm입니다.", name, age, bloodType, height); // 가능하지만...기능이 다다름

    }
}

//()가 있다면 메소드임. ()괄호 안은 메소드를 만들고있는 부분이고{()}안의 ()는 호출
