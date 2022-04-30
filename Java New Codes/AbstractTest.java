
 abstract  class ParentTest //May or may not have abstract methods
{

abstract public void cal();//abstract method should be define in the child class
static void display()
{

}
}

 class ChildTest extends ParentTest
{

    @Override
    public void cal() //define all the abstract method of parent class
    {
        ParentTest.display();
System.out.println("Child must define all the abstract method of parent class");

    }

}

public class AbstractTest {
    public static void main(String[] args) {

        ChildTest c1=new ChildTest();

     //   ParentTest p1=new ParentTest(); can't instantiated
     //         means can't decalre the object of abstract class


    }
}
