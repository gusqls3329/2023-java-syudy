package extra.day1;

public class OperatorEx19 {
    public static void main(String[] args) {
        int x = 10, y = 8;
        System.out.printf("x / y = %d, 나머지값 : %d\n ", x/y, x%y);

        int val = (int)(Math.random()*10)+1; //1~10 랜덤값
        // 값+ 짝 홀수

        System.out.printf("%d : %s수", val, val % 2 == 0? "짝":"홀");
    }
}
