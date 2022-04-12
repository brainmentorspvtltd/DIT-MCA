class Player
{
    void testing()
    {
        System.out.println("Parent class ....");
    }
}

class TestPlayer extends Player
{
    void show()
    {
        System.out.println("Child class...");
    }
}

public class SingleInherit {

    public static void main(String[] args) {

        TestPlayer test=new TestPlayer();
         test.show();
         test.testing();
    }

}
