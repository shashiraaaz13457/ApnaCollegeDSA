package Codes.Functions;

import java.util.Scanner;

public class PrintName {
    public static void printName(String value){
        System.out.println(value + " is my name");
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();

        printName(value);
    }
}
