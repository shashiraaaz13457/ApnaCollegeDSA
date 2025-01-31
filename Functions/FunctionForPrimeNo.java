package Codes.Functions;

import java.util.Scanner;

public class FunctionForPrimeNo {

    public static boolean PrimeOrNot(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(PrimeOrNot(num));
    }
}
