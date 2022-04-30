
 class PreTest
{
    static int a=10;
     void show()
    {
        System.out.println("show");
    }
}

class Test extends PreTest
{
    void show()
    {

    }
}


public class NewTest {

    public static void main(String[] args) {

        PreTest pre1=new PreTest();
        PreTest pre2=new PreTest();
        pre1.a++;
        System.out.println(pre1.a);
        System.out.println(pre2.a);

    }
}
