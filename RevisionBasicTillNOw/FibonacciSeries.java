package Codes.RevisionBasicTillNOw;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 2; i < n; i++) {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(sum);
        }
    }
}
