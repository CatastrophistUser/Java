import java.util.*;
class Distance //To print which element is the farthest from the average of all elements of an array.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,p=0;
        double sum=0,avg=0,maxDiff,diff;
        System.out.print("Enter array size");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+arr[i];
        
        }
        avg=sum/n;
        System.out.println(avg);
        maxDiff=0;
        for(i=0;i<n;i++)
        {
            diff=Math.abs(avg-arr[i]);
            if(diff>maxDiff)
                {
                maxDiff=diff;
                p=i;
            }
        }
        System.out.print(arr[p]);
    }
}
            
   
        
       