import java.util.Scanner;

public class Smallest {
    public static void main(String args[]) {

        int a,b;

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the value of a ");
        a=scan.nextInt();

        System.out.println("Enter the value of b ");
        b=scan.nextInt();

        if(a<b)
        System.out.println("a is smaller");
        else
        System.out.println("b is smaller");



    }
}
