package Introduction;

public class Cases {

    static int linearSearch() {
        int arr[] = {2,3,5,1,4,6,7};
        int search = 7;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == search) {
                return i;
            }
        }
        return -1;
    }

    void sumN() {
        int sum = 0;
        int n = 5;
        if(n % 2 == 0) {
            return;
        }
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
    }

    public static void main(String[] args) {
        linearSearch();
    }
}
