import java.util.Scanner;

import javax.management.ValueExp;

class Greater
{
int a,b;

void getdata()
{

    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the value of a ");
     a=scan.nextInt();

    System.out.println("Enter the value of b ");
    b=scan.nextInt();
}

void showdata()
{
    if(a>b)
    System.out.println("a is greater");
    else
    System.out.println("b is greater");


}

}




public class Test {

    public static void main(String[] args) {

        Greater greater=new Greater();
        greater.getdata();
        greater.showdata();
    }
}
