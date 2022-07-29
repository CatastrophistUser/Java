import java.util.*;
class Average //To print the average of all elements of an array.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        double sum=0,avg=0;
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
        System.out.print("Average="+avg);
    }
}
            
        