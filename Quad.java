public class Quad {

    public static void main(String[] args) {
        
        int sum=0,i,n=10,j;

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                sum++;
            }
        }
        System.out.println(sum);
    }
    
}
