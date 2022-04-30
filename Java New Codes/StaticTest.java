class Shape
{
    static int a=10;

   void display()
   {
       System.out.println("Non static display"+a); //Non static method can take both
       //static and non static variable
   }
    static
    {
        System.out.println("static block...");
    }
   static void show()
   {
       System.out.println("static show"+a);//static method can take
       //static variable only can't allowed non static variable
   }
}

public class StaticTest {

    public static void main(String[] args) {

        Shape s1=new Shape();
        Shape s2=new Shape();
       /* s1.a++;
        System.out.println("S1="+s1.a);
        System.out.println("S2="+s2.a);*/
        s1.display();
        Shape.show();
    }

}
