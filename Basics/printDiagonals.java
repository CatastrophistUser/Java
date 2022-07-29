import java.util.*;
class printDiagonals   //To print the diagonals.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int R,i,j;
        System.out.print("Enter rows");
        R=sc.nextInt();
        int arr[][]=new int[R][R];
        for(i=0;i<R;i++)
        {
            for(j=0;j<R;j++)
                arr[i][j]=(int)(Math.random()*54654)%20;
        }
        System.out.println("Original matrix");
        for(i=0;i<R;i++)
        {
            for(j=0;j<R;j++)
                System.out.print(arr[i][j]+"\t");
                System.out.println();
        }
        System.out.println("Output matrix");
        for(i=0;i<R;i++)
        {
            for(j=0;j<R;j++)
                if(i==j||i+j==R-1)
                    System.out.print(arr[i][j]+"\t");
                else
                    System.out.print("\t");
                System.out.println();
        }
    }
}