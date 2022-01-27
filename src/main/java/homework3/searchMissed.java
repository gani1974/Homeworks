package homework3;

import java.util.Arrays;

public class searchMissed {

    public static void main(String[] args) {
        test(3,1,2,4,5,6,7,8);
    }

    public static int search(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int base = (start + end) / 2;
            System.out.println("base: " + base);
            if (arr[base] - base == 1) {
                start = base + 1;
                System.out.println("start: " + start);
            } else {
                end = base - 1;
                System.out.println("end: " + end);
            }
        }
        return start + 1;
    }

    public static void test(int lostNum, int... arr) {
        System.out.printf("Пропущено: %d, найдено: %d%n", lostNum, search(arr));
    }
}
