public class MultipleTry {
    public static void main(String[] args) {

        try
        {
            int a[]=new int[10];
            a[20]=5;
            System.out.println(a);
        }catch(Exception e)
        {
         System.out.println("Exception cauught:"+e);
        }
        try
        {
         int div=5/0;
         System.out.println(div);

        }catch(Exception e)
        {
         System.out.println("Exception caught:"+e);
        }
    }

}
