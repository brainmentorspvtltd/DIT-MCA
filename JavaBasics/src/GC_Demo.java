import java.util.LinkedList;

class G {
    String t;
    int e;
    G(String t, int e) {
        this.t = t;
        this.e = e;
    }
}

public class GC_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		LinkedList l = new LinkedList<>();
        System.out.println("Program Started...");
        int i = 0;
        while(true) {
            G obj = new G("Hello", 12);
            i += 1;
            System.out.println("Object Created : " + i);
            l.add(obj);
            Thread.sleep(30);
        }

	}

}
