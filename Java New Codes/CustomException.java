import java.util.Scanner;

class InvalidAgeException extends Exception //custom Exception
{
    InvalidAgeException()
    {
        System.out.println("Invalid age ! u are not eligible for voting(age<18)");
    }
}
class ExceptionTest
{
    void show(int age) throws InvalidAgeException
    {
        try
        {
            if(age<18)
            throw new InvalidAgeException();
            else
            System.out.println("Congrats! U r eligible for voting");
        }catch(Exception e)
        {
         System.out.println(e);
        }
    }
}

public class CustomException { //user define exception

    public static void main(String[] args) throws InvalidAgeException {

        System.out.println("enter ur age");

        int age=new Scanner(System.in).nextInt();

        ExceptionTest test=new ExceptionTest();
        test.show(age);




    }

}
