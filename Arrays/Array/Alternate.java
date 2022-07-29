import java.util.*;
class Alternate
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.print(" ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i+=2)
        System.out.print(arr[i]);
    }
}
        
           