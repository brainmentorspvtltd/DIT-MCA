@FunctionalInterface
interface Calc {
    // SAM - Single Abstract Method
    int compute(int x, int y);
}

// class MyCalc implements Calc {

//     @Override
//     public int compute(int x, int y) {
//         System.out.println("Compute x and y...");
//         return 0;
//     }   
// }

public class InterfaceUseWays {
    public static void main(String[] args) {
        // MyCalc obj = new MyCalc();
        // obj.compute(12, 10);

        // this will create anonymous class
        // Calc obj = new Calc() {
        //     @Override
        //     public int compute(int x, int y) {
        //         return x + y;
        //     }
        // };
        // System.out.println(obj.compute(4, 5));

        // Java 8 onwards - Lambda Expressions
        // Calc c = (a,b) -> a + b;
        // System.out.println(c.compute(4, 6));

        Calc c = (a,b) -> {
            int d = a + b;
            System.out.println("Doing Addition...");
            return d;
        };
        System.out.println(c.compute(4, 5));

    }
}
