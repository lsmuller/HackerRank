package com.leticia;
import java.util.*;

public class BubbleSort {

    public static void sortAndPrint(int[] arr){
        int countSwaps = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    countSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + countSwaps  + " swaps");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length-1]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        sortAndPrint(arr);
    }

}
