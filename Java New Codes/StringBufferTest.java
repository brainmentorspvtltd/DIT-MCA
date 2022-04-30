public class StringBufferTest {

    public static void main(String[] args) {

        StringBuffer name1=new StringBuffer("Ekta");

        StringBuffer name2=new StringBuffer("Gupta");
        System.out.println(name1.append(name2));

       System.out.println("name1="+name1);
       System.out.println(name1.reverse());

    }

}
