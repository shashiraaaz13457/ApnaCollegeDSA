package Codes.RevisionBasicTillNOw;

import java.util.Scanner;

public class GreatestNO {

//    public static int GreatestNO(int num1,int num2){
//        if (num1 > num2){
//            return num1;
//        }return num2;
//    }
public static int GreatestNO(int num1,int num2,int num3){
    if (num1 > num2 && num1 > num3){
        return num1;
    }else if (num2 > num1 && num2 > num3){
        return num2;
    }return num3;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
//        int ans = GreatestNO(num1,num2);
        int ans = GreatestNO(num1,num2,num3);
        System.out.println(ans);
    }
}
