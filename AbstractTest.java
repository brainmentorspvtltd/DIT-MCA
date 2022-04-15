
abstract class ParentTest //May or may not have abstract methods
{

abstract void cal();//abstract method should be define in the child class
void display()
{

}
}

class ChildTest extends ParentTest
{

    @Override
    void cal() //define all the abstract method of parent class
    {
System.out.println("Child must define all the abstract method of parent class");

    }

}

class ChildTest2 extends ParentTest{

}

public class AbstractTest {
    public static void main(String[] args) {

        ChildTest c1=new ChildTest();

     //   ParentTest p1=new ParentTest(); can't instantiated
     //         means can't decalre the object of abstract class


    }
}
