import java.util.*;
class fnSumArray
{
    int sum(int arr[])
    {
        int i,s=0;
        for(i=0;i<arr.length;i++)
               s=s+arr[i];
        
               System.out.println("Address" + arr); 
               return s;
    }
    public static void main()
    {
        int arr[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
            arr[i]=sc.nextInt();
        
            fnSumArray ob=new fnSumArray();
            System.out.println("Address" + arr);
            int s=ob.sum(arr);
            
            System.out.print("Sum=" + s);
        }
    }
            
    