package gr.cf.bax.pg1;

public class MainArr {

    public static void main(String[] args) {
        int [] arr = {10, -5, 80, -44, -55};

        int maxValue = MathHelper.maxValue(arr);
        int minValue = MathHelper.minValue(arr);
        double avgValue = MathHelper.averageValue(arr);

        System.out.println("The max value of the array is: " + maxValue);
        System.out.println("The min value of the array is: " + minValue);
        System.out.println("The average value of this array is: " + avgValue);
    }
}
