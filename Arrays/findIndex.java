package Codes.Arrays;

import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        //Input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == x){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
