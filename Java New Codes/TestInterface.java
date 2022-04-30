interface A
{
   int a=10;//by default variables are final
   abstract void show();//by default method are abstract
    default void display(){}
    default void fill(){}
    default public void cut(){}
}

interface B
{
    void show();
}

interface D extends A,B
{

}

class C implements A , B
{

    @Override
    public void show() {

        // TODO Auto-generated method stub
        System.out.println("hello..hi..."+a);
    }

   public void fill()
    {
     System.out.println("filling...");
    }

}

public class TestInterface {

}
