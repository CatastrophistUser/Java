import java.util.*;
class max_min
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max,min;
        System.out.print("Enter array size");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        max=arr[0];
        min=arr[0];
        for(i=1;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Largest="+max);
        System.out.println("Smallest="+min);
    }
}

        