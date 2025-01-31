package Codes.Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Factorial(num));
    }
    public static int Factorial(int num){
        if (num < 0){
            System.out.println("Invalid Number");
            return 0;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
