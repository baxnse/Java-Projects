package gr.cf.bax.pg1;

/**
 * This class provides functionality to analyze stock movements relative to a base price.
 */
public class StockFollowUp {

    public static void main(String[] args) {
        int[] arr = {1, -1, -1, -1, 1, 1, 1, 1, -1, -1};
        int base = 10;

        countStockBase(arr, base);
    }

    /**
     * This method counts how many times the stock price goes below its base price.
     * @param arr a given array of each step of the stock's market
     * @param base the given base
     * @return The number of times the stock value has fallen below the base value
     */
    public static int countStockBase(int[] arr, int base) {
        int count = 0;
        int newBase = base;
        boolean passedBase = false;

        for (int el : arr) {
           newBase += el;
            System.out.print(newBase + " ");
           if (newBase > base) passedBase = true;
           if (newBase < base && passedBase) {
               count++;
               passedBase = false;
           }
        }
        System.out.printf("\nThe Stock has been dropped below BASE %d times", count);
        return count;
    }
}

