package Introduction;

public class AnalysisOfMultipleLoop {
    public static void main(String[] args) {
        int n = 10;
        // Sibling Loops
        for(int i = 0; i < n; i++) {
            // Logic
        }
        for(int i = 0; i < n; i=i*2) {
            // Logic
        }
        for(int i = 0; i < 10; i++) {
            // Logic
        }

        // Nested Loop
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j=j*2) {
                // Logic
            }
        }

    }
}
