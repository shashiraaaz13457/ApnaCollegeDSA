package Codes.Arrays;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]){
                isSorted = false;
            }
        }
        if (isSorted){
            System.out.println("Sorted in ascending Order");
        }else {
            System.out.println("Not sorted in ascending order");
        }
    }
}
