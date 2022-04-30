import java.util.Scanner;

class Number
{
public static void main(String arr[])
{
int rev=0,r,n;
System.out.println("Enter your number ");
 n=new Scanner(System.in).nextInt();
while(n>0)
      {
      r=n%10;
      rev=rev * 10 + r;
      n = n/10;
      }

      System.out.println("Reverse of input number is: "+rev);
}
}
