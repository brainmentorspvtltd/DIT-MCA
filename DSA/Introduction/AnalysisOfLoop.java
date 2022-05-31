package Introduction;

public class AnalysisOfLoop {
    public static void main(String[] args) {
        int n = 10;
        // TC : O(n)
        for(int i = 0; i < n; i++) {
            // Logic...
        }

        // TC : 0(n)
        int c = 2;
        for(int i = n; i > 0; i=i-c) {
            // Logic...
        }

        // TC : O(logn)
        for(int i = 1; i < n; i=i*c) {
            // Logic...
        }

        // TC : O(logn)
        for(int i = n; i > 1; i=i/c) {
            // Logic...
        }

        // TC : O(logn)
        for(int i = 2; i < n; i=(int)Math.pow(i, c)) {
            // Logic...
        }

    }
}
