
//SAM Interface //Functional Interface // Lambda Expression
interface FunctionalInterfaceTest
{
void display();
}

public class SAMInterface {
    public static void main(String[] args) {
//old method
        FunctionalInterfaceTest fit=new FunctionalInterfaceTest()
        {
            public void display()
            {
                System.out.println("Old method to define interface method");
            }
        }; //terminated by the semicolon

        fit.display();

//New Way Lambda Expression from Java 8

FunctionalInterfaceTest fit1=()->
{
System.out.println("New Way to display Lambda expression");
}; //terminated by the semicolon

fit1.display();
    }


}
