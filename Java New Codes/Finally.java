public class Finally {

    public static void main(String[] args) {

        try
        {
            String s=null;
         System.out.println("Hello"+s.length());

    }
   catch(NullPointerException e)
        {
         System.out.println("Exception caught:"+e);
        }
        finally
        {
            System.out.println("This block must be executed whether the exception occured or not");
        }

    }

}
