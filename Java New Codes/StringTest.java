public class StringTest {

    public static void main(String[] args) {

      //  String name="Ekta";
      // String name2= name.substring(0,4);

      String name1="Ekta";
      String name2="Gupta";
      System.out.println(name1.concat(name2));

      System.out.println(name1);
      System.out.println(name1.toLowerCase());
      System.out.println(name1.toUpperCase());
      System.out.println(name1.charAt(2));
      System.out.println(name1.equalsIgnoreCase(name2));
      System.out.println(name1.length());
      String x[]=name1.split("");
      for(int i=0;i<x.length;i++)
      {
        System.out.println(x[i]);
      }
     StringTest s1=new StringTest();
     StringTest s2=new StringTest();

       System.out.println("s1="+s1.toString());
       System.out.println("s2="+s2.toString());




    }

}
