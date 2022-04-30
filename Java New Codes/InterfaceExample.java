interface A
{
   default void show(){}
    default void display(){}
    default void add(){}
}

/*class B implements A //Adapter class
{
   public void show(){}
   public void display(){}
   public void add(){}

}*/
class C implements A
{
    public void show()
    {
        System.out.println("show...");
    }

    public void add()
    {
        System.out.println("Add...");
    }
}
public class InterfaceExample {

    public static void main(String[] args) {

        C c1=new C();
        c1.show();
        c1.add();
    }

}
