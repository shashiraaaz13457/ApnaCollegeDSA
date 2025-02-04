package Codes.Arrays;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values you want in an array: ");
        int n = sc.nextInt();

        String[] name = new String[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
        }

//        for (int i = 0; i < n; i++) {
//            System.out.println(name[i]);
//        }
        for(int i=0; i<name.length; i++) {
            System.out.println("name " + (i+1) +" is : " + name[i]);
        }

    }
}
