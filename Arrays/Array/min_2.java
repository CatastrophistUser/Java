import java.util.*;
class min_2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max,max2;
        System.out.print("Enter array size");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        max=arr[0];
        for(i=1;i<n;i++)
        {
        if(arr[i]>max)
         max=arr[i];
        }
        max2=arr[0];
        if(arr[0]==max)
            max2=arr[1];
        for(i=0;i<n;i++)
        {
            if(arr[i]>max2 && arr[i]!=max)
                max2=arr[i];
            }
        
         System.out.print("Largest="+max);
        System.out.print("Second Largest="+max2);
     }
}    