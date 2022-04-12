class Vehicles
{
    int x=100;
    Vehicles()
    {   int x=500;
        this.x=x+x;
        System.out.println("parent x="+(this.x+x));
    }}

class CARS extends Vehicles
{
int x=200;
CARS()
{     int x=1000;
    x=super.x+this.x;
    System.out.println("Child x="+(x+this.x));
}}
public class ThisSuperTest {
    public static void main(String[] args) {
      CARS cars=new CARS();

    }
}
