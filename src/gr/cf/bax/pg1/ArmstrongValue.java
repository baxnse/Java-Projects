package gr.cf.bax.pg1;

/**
 * This class finds if a value is an Armstrong number.
 *
 * An Armstrong number for a given base is a number
 * that is equal to the sum of its digits,
 * where each digit is raised to the power of the number of digits.
 *
 * Example: 153 = 1^3 + 5^3 + 3^3
 */
public class ArmstrongValue {

    public static void main(String[] args) {
        int value = 153;

        boolean arr = (checkArmstrong(value));

        if (arr) System.out.println("✅ This value is an Armstrong number");
        else System.out.println("❌ This Value is not an Armstrong number");
    }

    public static boolean checkArmstrong(int value) {
        String s = String.valueOf(value);
        int[] arr = new int[s.length()];
        int sumValue = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            arr[i] = (int) Math.pow(digit, s.length());
        }

        for (int el : arr) {
            sumValue += el;
        }

        return sumValue == value;
    }
}
