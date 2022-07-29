import java.util.*;
class MinMax
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int R,C,i,j,min=0,max=0;
        System.out.print("Enter rows");
        R=sc.nextInt();
        System.out.print("Enter cols");
        C=sc.nextInt();
        int arr[][]=new int[R][C];
        for(i=0;i<R;i++)
        {
            for(j=0;j<C;j++)
                arr[i][j]=(int)(Math.random()*4547)%11;
            }
        
        System.out.println("Original matrix");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[0].length;j++)
                    System.out.print(arr[i][j]+"\t");
                    System.out.println();
        }
        for(i=0;i<arr.length;i++)
        {
            min=arr[0]; max=arr[0];
            for(j=0;j<arr[0].length;j++)
            {
                
       
        
        
        
      
            