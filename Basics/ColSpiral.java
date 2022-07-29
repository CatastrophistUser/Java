import java.util.*;
class ColSpiral //To print a 2D spiral array, column-wise.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int R,C,i,j,p=1;
        System.out.print("Enter rows & cols");
        R=sc.nextInt();
        C=sc.nextInt();
        int mat[][]=new int[R][C];
        for(i=0;i<C;i++)
        {
            if(i%2==0)
            {
                for(j=0;j<R;j++)
                    mat[j][i]=p++;
                }
                else
                    for(j=R-1;j>=0;j--)
                        mat[j][i]=p++;
                    }
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
                System.out.print(mat[i][j]+"\t");
                System.out.println();
            }
        }
    }