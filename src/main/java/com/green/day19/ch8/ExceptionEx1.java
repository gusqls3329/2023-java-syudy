package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int num = 0;
        try { //try의 코드는 예외가 발생할것같다 , 에러가 발생되지 않으면 try에 적힌것이 실행 //try문은 계속 돌아감
            num = 10;
            num = num / 0; //대부분0을 나누면 에러가 발생
        } catch (Exception e) { //만약 예외가 터졌을 때 catch가 실행 //e
            e.printStackTrace(); //왜에러가 발생했는지 작성해주는 코드
            System.out.println("예외발생!");
            num = -1;
        } finally { //finally: 있어도 없어도 상관없지만 , 적혀있다면 예외가 발생되든 안되든 반드시 실행된다.
            System.out.println("finally 실행");
        }
        System.out.printf("num: %d\n", num);
        System.out.println("--끝--");
    }
}

class ExceptionEx1_2 { //finally가 필요한 코드
    public static void main(String[] args) {
        div(20);
    }

    public static void div(int num) {
        try {
            num = 10;
            return; //return을 만나면 System.out.printf("num: %d\n",num);가 실행이 안되기 때문에 finally가 필요함

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외발생!");
            num = -1;
        } finally {
            System.out.println("finally 실행");
        }
        System.out.printf("num: %d\n", num);
        System.out.println("--끝--");
    }
}

class ExceptionEx1_3 {
    public void sum() {
    }

    public static void main(String[] args) { //예외 종류에 따라 다른 처리를 하고 싶을때 사용
        try {
            //int num = 10/0;
            // ExceptionEx1_3 obj = null;
            //obj.sum();
            int[] arr = new int[10];
            arr[10] = 10;
        } catch (ArithmeticException e) { //3개중 하나만 사용, 에러는 가장 빨리 만나는 위의 에러가 실행
            //한번에 예러 예외를 하고싶을 때 ArithmeticException | ArrayIndexOutOfBoundsException e
            System.out.println("수학적 예외");
        } catch (NullPointerException e) {
            System.out.println("널포인트 예외");
        } catch (
                Exception e) { //Excrption은 가장 마지막에 있어야함. Excrption은 ArithmrticExcrption , NullPointExcrption을 상속함. 모든 예외의 부모는Excrption
            System.out.println("모든 예외");
        }
        System.out.println("끝!!"); //try문안에 있어야 멈추지않아 sout가 실행됨
    }
}

