package extra.day1;

public class Casting {
    public static void main(String[] args) {
        int n1=10, n2 = 3;
        long l1 = 1000L;
        float f2 = l1;

        float f = (float) n1/n2;

        System.out.printf("%.3f\n",f);
    }
}
