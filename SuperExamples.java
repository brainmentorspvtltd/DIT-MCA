class Manager
{
    int x=800;
   Manager()
    {
    System.out.println(this.x);
    }
    Manager(int x)
    {
        System.out.println(this.x+x);
    }
}
class Labour extends Manager
{
    int x=500;

    Labour(int x)
    { 
        super(400);
    System.out.println(super.x+this.x);
    }
    Labour(int x,int y)
    {
        this(100);
        System.out.println(super.x+this.x+x);
    }
}
public class SuperExamples
{
public static void main(String[] args)
{
    Labour l1=new Labour(300);
    Labour labour=new Labour(100,500);

}


}



