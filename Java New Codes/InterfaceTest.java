
interface A
{
 default void show(){}//default keyword is introduce in Java 8
  default void display(){}

}

class B implements A
{

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }

}



public class InterfaceTest {

}
