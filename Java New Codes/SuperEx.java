class Parent
{ int a=10;
    void show()
    {
System.out.println("a is "+a);
    }
    Parent()
    {
        System.out.println("Parent default");
    }}
class Child extends Parent
{ int b=20;
void show()//function overriding same function in parent class as well as in child class
{   super.show();
    System.out.println("value is "+(super.a+b));
}
Child()
{    //super();
    System.out.println("Child default");
}}
public class SuperEx {

    public static void main(String[] args) {
                Child child=new Child();
                child.show();
    }

}

