class Vehicle
{
    void show()
    {
        System.out.println("Grand parent class...Vehicle");
    }
}
class CAR extends Vehicle
{
    void show() //function overriding same function in parent class
                //as well as in the child class
    {

        System.out.println("Parent class .....CAR");
        super.show();//Vehicle class
    }
}
class BMW extends CAR
{
    void show()
    {
        super.show();//CAR class
        System.out.println("Child class....BMW");
    }
}



public class MultipleInherit {

    public static void main(String[] args) {

        BMW bmw=new BMW();
        bmw.show();
    }

}
