import java.util.*;
class cornerAndCenter  
{
    public static void main()
    {
        int R,C,i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows & columns");
        R=sc.nextInt();

        int mat[][]=new int[R][R];
        for(i=0;i<R;i++)
        {
            for(j=0;j<R;j++)
            mat[i][j]=(int)(Math.random()*654687%25);
        }
        System.out.print("Original matrix\n"); 
        for(i=0;i<R;i++)
        {
            for(j=0;j<R;j++)
            System.out.print(mat[i][j]+"\t");
            System.out.println();
        }


        for(i=0;i<R;i++)
        {
            for(j=0;j<R;j++)
            if(((i==0)&&(j==0||j==R-1))||((i==R-1)&&(j==0||j==R-1)))  //(i==R/2 && j==R/2)(for center)
            System.out.print(mat[i][j]+"\t");
            else
            System.out.print("\t");
            System.out.println();
        }
    }
}