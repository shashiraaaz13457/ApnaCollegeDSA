package Codes.HwPatternQuestions;

import java.util.Scanner;

public class PrintHollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(" ");
            }
            //Star
            for (int j = 1; j <= n ; j++) {
                if (j == 1 || j == n || i == 1 || i == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
