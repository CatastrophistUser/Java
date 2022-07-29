import java.util.*;
class Binary //For Binary Searching (Ascending Order)
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int low=0,mid,high,c=0,p=-1,num,n,i;
        System.out.print("Enter size");
        n=sc.nextInt();
System.out.println(n);
        long arr[]=new long[n];
        System.out.print("Enter elements");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("Enter searching element");
        num=sc.nextInt();
        high=arr.length-1;
        while(low<=high)
        {
            mid=(low+high)/2;          //Descending Order:
            if(num>arr[mid])           //if(num<arr[mid]) 
            low=mid+1;                   
            else if(num<arr[mid])      //else if(num>arr[mid])
            high=mid-1;
            else
            {
                p=mid;
                break;
            }
        }
            if(p>=0)
            System.out.print("Number exists at="+p);
            else
            System.out.print("Number doesn't exists");
    }
}



   