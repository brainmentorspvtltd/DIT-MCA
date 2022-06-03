package Array;

public class P3_SecondLargest {
    // Time : O(n)
    static void approach_1(int arr[], int n) {
        int max = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int secondMax = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }

        System.out.println("Second Largest Element is : " + secondMax);
    }

    static void approach_2(int arr[], int n) {
        int max = -1;
        int secondMax = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second Largest : " + secondMax);
    }
}
