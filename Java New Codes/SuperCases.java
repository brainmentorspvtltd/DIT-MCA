class Manager
{
    int y=500;

    {
    System.out.println("Parent init...");
}

void show()
{
    System.out.println("Parent show...."+y);
}
static
{
    System.out.println("Parent static...");
}
Manager()
{
    System.out.println("Parent default constructor");
}}
class Sub extends Manager
{
    int x=10;
    static
    {
        System.out.println("child static...");
    }
     void show()
     {
       //   super.show();
         System.out.println("Child show..."+x);
     }

    {
        System.out.println("Child init...");
    }
    Sub()
    {  //super();//it must be the first statement whether write or not
        System.out.println("Child default constrcutor");
    }}
public class SuperCases {

    public static void main(String[] args) {
        Sub sub=new Sub();
        sub.show();
       // System.out.println(sub.x);
    }
}
