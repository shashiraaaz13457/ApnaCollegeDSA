package Codes.RevisionBasicTillNOw;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.print("Enter the expo value: ");
        int expo = sc.nextInt();
        int value = 1;
        for (int i = 1; i <= expo ; i++) {
            value = value * base;
        }
        System.out.println(value);
    }
}
