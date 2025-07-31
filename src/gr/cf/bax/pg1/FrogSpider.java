package gr.cf.bax.pg1;

import java.util.Scanner;

public class FrogSpider {

    public static void main(String[] args) {
        int [][] grid = {
                {3, 2, 6},
                {4, 4, 4},
                {-5, 10, 22},
                {10, 5, 2}
        };

        for (int i = 0; i < grid.length; i++) {
            findDistance(grid[i][0], grid[i][1],grid[i][2]);
        }
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Παρακαλώ Εισάγεται την θέση FROG1");
//        int f1Position = scanner.nextInt();
//
//        System.out.println("Παρακαλώ Εισάγεται την θέση FROG2");
//        int f2Position = scanner.nextInt();
//
//        System.out.println("Παρακαλώ Εισάγεται την θέση SPIDER");
//        int sPosition = scanner.nextInt();


    }

    public static void  findDistance( int f1, int f2, int s) {
        int distanceF1 = Math.abs(s - f1);
        int distanceF2 = Math.abs(s - f2);

        if (distanceF1 < distanceF2) {
            System.out.println("Βάτραχος 1");
        } else if (distanceF1 > distanceF2) {
            System.out.println("Bάτραχος 2");
        }else System.out.println("Αράχνη");
    }
}
