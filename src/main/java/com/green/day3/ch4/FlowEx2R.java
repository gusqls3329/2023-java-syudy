

import java.util.Scanner;

public class FlowEx2R {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {
            System.out.println("숫자를 하나 입력하세요 >");
        }

        int val = scan.nextInt();

        if (val == 0) {
            System.out.println("다른 값을 입력해 주세요");
        } else {
            System.out.printf("%d는(은) %s수 입니다", val, (val % 2 == 0 ? "짝" : "홀"));
        }
    }
}
//사망식으로 처리