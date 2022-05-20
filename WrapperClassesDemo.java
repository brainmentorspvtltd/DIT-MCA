public class WrapperClassesDemo {
    public static void main(String[] args) {
        // int x = 12;  // value variable
        // int x1 = 12090909;
        // int x2 = 2147483648;
        
        // Autoboxing
        Integer x = 10; // reference variable
        int y = x;  // unboxing

        int x2 = 100;
        Integer y2 = x2;    // boxing

        // old style of boxing and unboxing
        Integer i = new Integer(y); // boxing
        int j = i.intValue();   // unboxing

        Byte b = 12;
        Float f = 12.44f;
    }
}