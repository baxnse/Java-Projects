package gr.cf.bax.pg1;

import java.util.Scanner;

public class UpperLowerCaseString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the word you want to format");
        String s = scanner.nextLine();

        formatString(s);
    }

    public static void formatString(String s) {
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";

        for (int i = 0; i < s.length(); i = i + 2) {
            str1 = String.valueOf(s.charAt(i) + " ");
            str2 += str1.toUpperCase();
        }

        for (int i = 1; i < s.length(); i = i + 2) {
            str3 = String.valueOf(" " + s.charAt(i));
            str4 += str3.toLowerCase();
        }
        for (int i = 0; i < str4.length(); i++) {

        str5 = str2.replace(" ",String.valueOf(str4.charAt(i))); // BUG!!!!

        }

        System.out.println(str2);
        System.out.println(str4);
        System.out.println(str5);
    }
}
