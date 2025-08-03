package gr.cf.bax.pg1;

/**
 * Finds the position of the first negative value of an array.
 */
public class NegativeValuePosition {

    public static void main(String[] args) {
        int[] arr1 = {10, 8, -10, 5, -25, 5};
        int[] arr2 = {10, 8, 10, 5, 25, 5};

        int position = findNegativePosition(arr1);

        if (position == -1) System.out.println("Δεν βρέθηκε αρνητικός αριθμός");
        else System.out.printf("The first negative value was found at position: %d",position);

    }

    public static int findNegativePosition(int[] arr) {
        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) return position = i;
        }
        return position;
    }
}
