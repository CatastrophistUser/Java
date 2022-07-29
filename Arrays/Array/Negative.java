import java.util.*;
class Negative //To print all the negative numbers first and then positive in an array.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c,p1,p2;
        System.out.print("Enter array A size");
        n=sc.nextInt();
        int A[]=new int[n];
        int B[]=new int[n];
        System.out.print("Enter Array A elements");
        for(i=0;i<n;i++)
        A[i]=sc.nextInt();
        p1=0; p2=n-1;
        for(i=0;i<n;i++)
        {
            if(A[i]<0)
            B[p1++]=A[i];
            else
            B[p2--]=A[i];
        }
        for(i=0;i<n;i++)
        System.out.print(B[i]+" ");
    }
}
            
            
        