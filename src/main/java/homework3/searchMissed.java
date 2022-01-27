package homework3;

import java.util.Arrays;

public class searchMissed {

    public static void main(String[] args) {
//        test(11, 1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16);
//        test(3,1, 2, 4, 5, 6);
        test(1);
    }

    public static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int base = (start + end) / 2;
            if (arr[base] - base == 1) {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }
        return start + 1;
    }

    public static void test(int lostNum, int... arr) {
        System.out.println(Arrays.toString(arr) + " => " + lostNum);
    }
}
