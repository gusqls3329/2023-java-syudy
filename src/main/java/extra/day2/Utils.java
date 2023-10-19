package extra.day2;

import java.util.Arrays;

public class Utils {
    public static int abs(int n) {

        return n < 0 ? -n : n;
    }

    public static int sumArr(int[] intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.length; i++) {

            sum += intArr[i];

        }return sum;

    }

    public static int [] mapPlus(int [] intArr, int n ){
        int [] tmp = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            tmp[i] = intArr[i] + n;
        }
        return tmp;
    }
}

class UtilsTest {
    public static void main(String[] args) {
        int r = Utils.abs(-10);
        System.out.println("r : " + r);
        System.out.println("r2 : " + Utils.abs(-9));
        System.out.println("r2 : " + Utils.abs(8));

        int[] intArr = {10, 12, 13, 14};
        int sum = Utils.sumArr(intArr);
        System.out.println("sum: "+sum);

        int [] rArr = Utils.mapPlus(intArr,5);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(rArr));
    }
}