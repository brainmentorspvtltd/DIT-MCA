import java.util.Scanner;

class Bird
{
    int a=50;//instance variable

    Bird()
    {
      int a=200;//local
      a=this.a+a;
System.out.println("Default Constructor calling..."+a);
    //to initiliase the value of a as zero
    }

    Bird(int a) //local variable
    {
        this();//calls the default constructor
        System.out.println("Single parametrised ...."+a);
    }

    Bird(int a,int b)//local variable
    {
        this(10); //calls single parametrised
    System.out.println("Double Parametrised...."+a+" "+b);

    }


   /* void getData()
    {
        int x,y;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of x");
        x=scanner.nextInt();
        System.out.println("Enter the value of y");
        y=scanner.nextInt();

    }*/

}






public class CheckTest {

    public static void main(String[] args) {

     //   Bird bird1=new Bird();//called automatically
       // Bird bird2=new Bird(10);//call single parametrised
        Bird bird3=new Bird(100,200);//call douuble parametrised



    }

}
