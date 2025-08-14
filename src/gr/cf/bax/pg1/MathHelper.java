package gr.cf.bax.pg1;

public class MathHelper {

    private MathHelper() {

    }

    public static int maxValue(int[] arr) {
        int max = arr[0];

        for (int el : arr) {
            if (el > max) max = el;
        }
        return max;
    }

    public static int minValue(int[] arr) {
        int min = arr[0];

        for (int el : arr) {
            if (el < min) min = el;
        }
        return min;
    }

    public static double averageValue(int[] arr) {
        int num = 0;

        for (int el : arr) {
            num += el;

        }
        return (double) num / arr.length;
    }
}
