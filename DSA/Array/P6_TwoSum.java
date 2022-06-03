package Array;

import java.util.Arrays;
import java.util.HashMap;

public class P6_TwoSum {
    // Using Brute Force
    public int[] twoSum(int[] arr, int target) {
        int sum = 0;
        int output[] = new int[2];
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == target) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }    

    // Using Hashmap
    static void approach_2(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : arr) {
            if(map.get(element) == null) {
                map.put(k-element, element);
            }
            else {
                System.out.println("Pair Found : " + map.get(element) + "," + element);
            }
        }
    }

    // Using two pointer
    void approach_3(int arr[], int k) {
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;
        while(first < last) {
            if(arr[first] + arr[last] == k) {
                System.out.println("Pair Sum Found : " + first + "," + last);
                return;
            }
            if(arr[first] + arr[last] < k) {
                first++;
            }
            else if(arr[first] + arr[last] > k) {
                last--;
            }
        }
    }

}
