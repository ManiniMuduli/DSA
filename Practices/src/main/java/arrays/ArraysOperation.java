package arrays;

import java.util.Scanner;

public class ArraysOperation {
    public static void main(String[] args) {
        System.out.println("Welcome to DSA world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element to the array");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The element of the array");
        for(int ele : arr){
            System.out.println(ele);
        }
    }
}