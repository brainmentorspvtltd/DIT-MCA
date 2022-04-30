import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String org,rev="";
        System.out.println("Enter the string");
        Scanner scan=new Scanner(System.in);
        org=scan.nextLine();
        int len=org.length();

        for(int i=len-1;i>=0;i--)
        {
            rev=rev+org.charAt(i);
        }

        if(org.equalsIgnoreCase(rev))
        System.out.println("It is a Palindrome");
        else
        System.out.println("Not a Palindrome");


    }

}
