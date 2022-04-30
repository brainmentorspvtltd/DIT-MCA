public class Multiplication {

    public static void main(String[] args) {

        int a[][]={{1,2},{4,5}};
        int b[][]={{3,4},{1,2}};
        int c[][]=new int[2][2];
        int i,j,k;

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
              //  c[i][j]=0;
               for(k=0;k<a[j].length;k++)
               {
               c[i][j]+=a[i][k]*b[k][j];
               }
            }
        }

        System.out.println("Multiplication of Matrix is ");

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
    }
}
}
