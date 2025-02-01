package Codes.RevisionBasicTillNOw;

import java.util.Scanner;

public class Average {
//    public static int average(int num1,int num2,int num3){
//        int sum = num1 + num2 + num3;
//
//        int avg = sum / 3;
//        return avg;
//
//
//    }
    public static double average(int[] numbers){
        if (numbers.length == 0) return 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double avg = (sum)/ numbers.length;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n ; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(average(numbers));
//        System.out.println(average(num1,num2,num3));

    }
}
