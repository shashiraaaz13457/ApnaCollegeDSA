package Codes.RevisionBasicTillNOw;

import java.util.Scanner;

public class positiveNegativeZeroCount {
    public static void Count(int[] values){
        int positiveCount = 0;
        int negativeCount = 0;
        int ZeroCount = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0){
                positiveCount++;
            } else if (values[i] < 0) {
                negativeCount++;
            }else{
                ZeroCount++;
            }
        }
        System.out.println("Positive Count: "+positiveCount);
        System.out.println("Negative Count: " + negativeCount);
        System.out.println("Zero Count: " + ZeroCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] values = new int[n];
        for (int i = 0; i < values.length ; i++) {
            System.out.println("Enter the value:  " );
            values[i] = sc.nextInt();
        }

        Count(values);
    }
}
