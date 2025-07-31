package gr.cf.bax.pg1;

public class RepeatedString {

    public static void main(String[] args) {
        String s = "amalia";
        System.out.println(multiplyString(s, 3));
        System.out.println(getRepeated2(s, 10));
    }

    public static String multiplyString (String s, int a) {

        return s.repeat(a);
    }

    public static String getRepeated2(String s, int n) {
        int times;

        times = (int) Math.ceil((double) n / s.length());
        return s.repeat(times);
    }
}
