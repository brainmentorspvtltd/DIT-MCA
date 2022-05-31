package Introduction;

public class DSAIntro {

    void approach_1(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
    }

    int approach_2(int n) {
        return n * (n+1) / 2;
    }

    void approach_3(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                sum++;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}