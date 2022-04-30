
interface A
{
    void show();
    void display();
}

interface B
{
    void cal();
}

interface C extends A,B
{
    void show();
}
class Adapter implements A,B ,C
{

    @Override
    public void cal() {
        // TODO Auto-generated method stub

    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }

}
class Child extends Adapter
{

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

}

public class Interface {
    public static void main(String[] args) {
        Child c=new Child();
        c.show();

    }

}
