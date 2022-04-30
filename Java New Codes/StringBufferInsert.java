public class StringBufferInsert {

    public static void main(String[] args) {

        StringBuffer str=new StringBuffer("ello");
        System.out.println("Befor Insertion string is "+str);

        str.insert(0,"H");

        System.out.println("After Insertion string is "+str);
   //or
   System.out.println("Using String Builder");
   StringBuilder str1=new StringBuilder("ello");
        System.out.println("Befor Insertion string is "+str1);

        str1.insert(0,"H");

System.out.println("After Insertion string is "+str1);




    }

}
