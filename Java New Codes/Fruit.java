class FruitTest
{

int color=100;//instance

FruitTest()
{
System.out.println("Default"+color);
}

FruitTest(int color)
{

this.color=this.color+color;
System.out.println("single "+this.color);//110
}
}

class Fruit
{
    public static void main(String[] args)
    {
        FruitTest fruittest1=new FruitTest();//default
        FruitTest fruittest2=new FruitTest(10);//single


    }
}





