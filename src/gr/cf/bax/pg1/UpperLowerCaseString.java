package gr.cf.bax.pg1;

import java.util.Scanner;

public class UpperLowerCaseString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a word for case formatting:");
        String s = scanner.nextLine();

        formatString(s);
    }

    public static void formatString(String s) {

        String lowerS = s.toLowerCase();
        StringBuilder finalS = new StringBuilder(lowerS.length());

        for (int i = 0; i < s.length(); i++) {
            char c = lowerS.charAt(i);

            if ( i % 2 == 0) {
                finalS.append(Character.toUpperCase(c));
            }
            else finalS.append(c);
        }

        System.out.println(finalS);
    }
}
