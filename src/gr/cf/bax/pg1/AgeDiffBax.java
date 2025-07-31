package gr.cf.bax.pg1;

public class AgeDiffBax {

    public static void main(String[] args) {
        int [] arr = {25, 36, 45, 23};
        int age = 55;

        System.out.printf("The diff of the Top Age and age is: %d",findAgeDiff(arr, age));
    }

    public static int findAgeDiff( int[] arr, int age) {
        int topAge = 0;
        int ageDiff;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > topAge) topAge = arr[i];
        }
//        if (topAge - age <= 0) return 0;
//        System.out.printf("The Top Age is: %d \n", topAge);
//        return topAge - age;
        ageDiff = topAge - age;
        return (ageDiff > 0) ? ageDiff : 0;
    }
}
