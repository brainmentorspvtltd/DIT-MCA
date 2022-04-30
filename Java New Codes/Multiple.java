interface P1
{
     int a=10;
   void show();//by default all the methods are abstract
}
interface P2
{
 void show();
}

class Child implements P1,P2 //instead of extends we use implements
{

    @Override
    public void show() {
     System.out.println("Child show..."+a);


    }

}

public class Multiple {

    public static void main(String[] args) {
        Child c1=new Child();
        c1.show();
    }

}
