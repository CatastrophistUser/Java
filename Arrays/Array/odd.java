import java.util.*;
class odd //To print product of all odd numbers.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int m=1,i,n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            m=m*arr[i];
        }
        System.out.print("Product="+m);
    }
}
 