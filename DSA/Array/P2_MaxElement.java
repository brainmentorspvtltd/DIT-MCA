package Array;

import java.util.Arrays;

public class P2_MaxElement {
    static void approach_1(int arr[], int n) {
        long start = System.nanoTime();
        boolean isMax;
        for(int i = 0; i < n; i++) {
            isMax = true;
            for(int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) {
                    isMax = false;
                    break;
                }
            }
            if(isMax) {
                System.out.println("Largest Element is : " + arr[i]);
                long end = System.nanoTime();
                long total = end - start;
                System.out.println("Execution Time is : " + total);
                return;
            }
        }
    }

    static void approach_2(int arr[], int n) {
        long start = System.nanoTime();
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element is : " + max);
        long end = System.nanoTime();
        long total = end - start;
        System.out.println("Execution Time is : " + total);
    }

    static void approach_3(int arr[], int n) {
        long start = System.nanoTime();
        Arrays.sort(arr);
        int max = arr[n-1];
        System.out.println("Largest Element is : " + max);
        long end = System.nanoTime();
        long total = end - start;
        System.out.println("Execution Time is : " + total);
    }

    public static void main(String[] args) {
        int arr[] = {10,19,2,5,3,12};
        int n = arr.length;
        approach_1(arr, n);
        approach_2(arr, n);
        approach_3(arr, n);
    }
}
