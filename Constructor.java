class Animal
{
   Animal()
    {
        System.out.println("Default constructor...");
    }

    Animal(int a)
    {
        this();//calls the default
        System.out.println("Single Parametrized...."+a);
    }

    Animal(int a,int b)
    {
        this(5);//calls the parametrized
        System.out.println("Double Parametrized..."+a+" "+b);
    }
}

public class Constructor {

    public static void main(String[] args) {
     //   Animal a1=new Animal(); //call default constructor
       // Animal a2=new Animal(5); //call single parametrized constructor
        Animal a3=new Animal(10,20);//call double parametrized constrcutor


    }
}
