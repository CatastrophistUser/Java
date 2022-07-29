import java.util.*;
class Rev
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,l,i,t;
        System.out.print("Enter size");
        n=sc.nextInt();
        l=n-1;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
            for(i=0;i<=n/2;i++,l--)
            {
                t=arr[i];
                arr[i]=arr[l];
                arr[l]=t;
            }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+ " ");
    }
}
            
      
