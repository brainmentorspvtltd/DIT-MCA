import java.util.Scanner;

class Account
{
String c_name;
int c_id;

void getData()
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the name of the customer..");
    c_name=scan.nextLine();

    System.out.println("Enter the customer id... ");
    c_id=scan.nextInt();
}

void showData()
{
    System.out.println("Customer name is "+c_name);
    System.out.println("Customer id is "+c_id);
}

}

class Saving
{
int deposit,withdraw,bal,ac_no;

Saving()
{
bal=5000;
}
void getData()
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Account Number of Saving Account..");
    ac_no=scan.nextInt();

    System.out.println("Enter the deposit amount..");
    deposit=scan.nextInt();

    System.out.println("Enter the withdrawal amount..");
    withdraw=scan.nextInt();

}

void showData()
{

    bal=bal+deposit-withdraw;
    System.out.println("Balance is now "+bal);
    if(bal<=5000)
    System.out.println("You can't withdraw this amount..Plz maintain the min bal of rs 5000");
    else
    System.out.println("Deposit/Withdrawal is successful...Now your bal is "+bal);

}


}

class Current
{
    int deposit,withdraw,bal,ac_no;
Current()
{
    bal=1000;
}
void getData()
{
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Account Number of Current Account..");
    ac_no=scan.nextInt();

    System.out.println("Enter the deposit amount..");
    deposit=scan.nextInt();


    System.out.println("Enter the withdrawal amount..");
    withdraw=scan.nextInt();
}

void showData()
{
     
    bal=bal+deposit-withdraw;
    System.out.println("Balance is now "+bal);
    if(bal<=1000)
    System.out.println("You can't withdraw this amount..Plz maintain the min bal of rs 1000");
    else
    System.out.println("Deposit/Withdrawal is successful...Now your bal is "+bal);

}


}

public class Accounts {
    int choice;
    public static void main(String[] args) {

        Account account =new Account();
        account.getData();
        account.showData();
        Saving saving=new Saving();
        Current current=new Current();


        System.out.println("Press 1 for Saving Account");
        System.out.println("Press 2 for Current Account");
        System.out.println("Enter your choice...");
        int choice=new Scanner(System.in).nextInt();
        switch(choice)
        {
         case 1:
         saving.getData();
         saving.showData();
         break;

         case 2:
         current.getData();
         current.showData();
         break;

         default:
         System.out.println("Wrong choice...");


        }





    }
}
