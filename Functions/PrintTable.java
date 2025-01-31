package Codes.Functions;

import java.util.Scanner;

public class PrintTable {

    public static void printTable(int num){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(num * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printTable(num);
    }
}
