class Color
{
    {
        System.out.println("Welcome....");
    }
    Color()
    {
        System.out.println("Default constructor calling...");
    }
    static
    {
        System.out.println("static calling first....");
    }
    {
        System.out.println("Init block calling...");
    }
   static
   {
       System.out.println("Static block calling....");
   }



}

public class InitExample {

    public static void main(String[] args) {

        Color red=new Color();
        Color pink=new Color();

    }
}
