package Codes.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //1st method
//        Arrays.sort(arr);
//        System.out.println("Max num: " + arr[size-1]);
//        System.out.println("Min num: " + arr[0]);

        //2nd Method
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max no: " + max);
        System.out.println("Min no: " + min);
    }

}
