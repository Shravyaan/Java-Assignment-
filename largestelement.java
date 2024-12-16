package week1;

import java.util.Scanner;

public class largestelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        
//        System.out.println("Enter the first number:");
//        numbers[0] = scanner.nextInt();
//
//        System.out.println("Enter the second number:");
//        numbers[1] = scanner.nextInt();

        System.out.println("Enter the numbers:");
        for(int i = 0; i<10; i++) {
        arr[2] = scanner.nextInt();
        }
       
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

       
        System.out.println("The largest number is: " + max);
    }
} 
