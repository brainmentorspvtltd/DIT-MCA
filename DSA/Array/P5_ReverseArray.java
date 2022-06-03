package Array;

public class P5_ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int n = arr.length;
        int first = 0;
        int last = n-1;
        while(first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        for(int i : arr) {
            System.out.print(i + ",");
        }
    }
}
