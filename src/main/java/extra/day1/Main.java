package extra.day1;

public class Main {
    public static void main(String[] args) { // void는 return 타입 main:메소드명, (String[] args): 메게변수>> 외부에서 값이 들어오는 부분
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d]: %s\n", i, args[i]);
        }
        System.out.println("--------------");
        for (String str : args) {
            System.out.println(str);
        }
    }

    class util {

    }
}