final class FinalNew  //can't inherited
{
 final  int a=10;//its fix now

 final void show()
  {
  System.out.println("Parent show");
  }

  static void display()
  {
      System.out.println("static display");
  }
}

class ChildNew extends FinalNew
{
/*void show() //can't override the final method
{
System.out.println("Child show");
}*/

/*void display()//can't override the static method
{

}*/

}


public class FinalTest {

    public static void main(String[] args) {

        ChildNew n1=new ChildNew();
      //  n1.a=100; can't be change
        System.out.println(n1.a);
        n1.show();

    }

}
