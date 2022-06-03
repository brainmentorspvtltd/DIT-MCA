package Array;

import java.util.ArrayList;
import java.util.Collections;

public class P7_LeaderElement {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = 10;
        ArrayList<Integer> list = new ArrayList<>(n);
        int max = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] > max) {
                System.out.println("Leader Element : " + arr[i]);
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
