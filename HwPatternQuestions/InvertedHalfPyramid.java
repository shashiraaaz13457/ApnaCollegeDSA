package Codes.HwPatternQuestions;

import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //Star
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
