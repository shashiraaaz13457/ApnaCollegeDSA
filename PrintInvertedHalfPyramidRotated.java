package Codes;

import java.util.Scanner;

public class PrintInvertedHalfPyramidRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //For spaces
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            //For Star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
