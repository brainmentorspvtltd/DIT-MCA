
 class MyTest
{
  public static void main(String a)
    {
        System.out.println("main first");
    }

    public int main(int a)
    {
        System.out.println("main second");
        return 0;
    }

    public static void main()
    {
        System.out.println("main third");
    }
}




class First
 {
     public static void main(String[] args) {

        MyTest test =new MyTest();
        test.main("ekta");
        test.main(10);
        test.main();



     }
 }