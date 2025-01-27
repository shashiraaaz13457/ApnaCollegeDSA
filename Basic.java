package Codes;
import java.util.Scanner;

public class Basic {
//Q1.
//    *****
//    *****
//    *****
//    *****
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        for (int i = 0; i < rows; i++) {
//            System.out.println("*");
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
