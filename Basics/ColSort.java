import java.util.*;
class ColSort  //To sort an array column-wise.
{
    public static void main()
    {
        int R,C,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows & columns");
        R=sc.nextInt();
        C=sc.nextInt();
        int mat[][]=new int[R][C];
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            mat[i][j]=(int)(Math.random()*654687%25);
        }
        System.out.print("Original matrix\n"); 
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            System.out.print(mat[i][j]+"\t");
            System.out.println();
        }

        for(i=0;i<C;i++)
        {
            for(j=0;j<R;j++)
            {
                for(k=0;k<R-j-1;k++)
                {
                    if(mat[k][i]>mat[k+1][i])
                    {
                    int t=mat[k][i];
                    mat[k][i]=mat[k+1][i];
                    mat[k+1][i]=t;
                    }
                }
            }
        }
         System.out.print("Sorted matrix\n");
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
            System.out.print(mat[i][j]+"\t");
            System.out.println();
        }
    }
}
