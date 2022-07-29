import java.util.*;
class Merge //To join 2 arrays and print them as 1 array.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m,i,n,c;
        System.out.print("Enter array A size");
        m=sc.nextInt();
        System.out.print("Enter array B size");
        n=sc.nextInt();
        int A[]=new int[m];
        int B[]=new int[n];
        int C[]=new int[m+n];
        System.out.print("Enter Array A elements");
        for(i=0;i<m;i++)
        A[i]=sc.nextInt();
        System.out.print("Enter Array B elements");
        for(i=0;i<n;i++)
        B[i]=sc.nextInt();
        for(i=0;i<m;i++)
        C[i]=A[i];
        for(i=0;i<n;i++)
        C[i+m]=B[i];
        for(i=0;i<C.length;i++)
        System.out.print(C[i]);
    }
}
            
   