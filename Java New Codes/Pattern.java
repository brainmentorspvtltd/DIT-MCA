import java.net.SocketPermission;

public class Pattern {

    public static void main(String[] args) {

    int i,j,k;

    for(i=1;i<=7;i+=2)
    {
        for(k=5;k>=i;k-=2)
        {
            System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
            System.out.print(i);
        }
        System.out.println();
    }


    }
}
