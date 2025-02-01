package Codes.RevisionBasicTillNOw;

import java.util.Scanner;

public class GCD {
    public static int gCD(int num1, int num2){
        //Nothing then one is the factor.
        int gcd = 1;
        for (int i = 2; i <= Math.min(num1,num2) ; i++) {
            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = gCD(num1,num2);
        System.out.println(ans);
    }
}
