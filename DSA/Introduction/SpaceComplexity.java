package Introduction;

public class SpaceComplexity {

    int total(int arr[], int s) {
        for(int i = 0; i <= arr.length; i++) {
            s += arr[i];
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 10;
        int s = n * (n + 1) / 2;    // SC : O(1)

        // SC:  O(1)
        int s1 = 0;
        for(int i = 1; i <= n; i++) {
            s += i;
        }
    }
}
