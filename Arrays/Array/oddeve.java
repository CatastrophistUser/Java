import java.util.*;
class oddeve
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,odd=0,eve=0,sumE=0,sumO=0;
        System.out.print(" ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
//  System.out.println(arr);  To give output of garbage value.
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
        {
            eve++;
            sumE=sumE+arr[i];
        }
        else
        {
            odd++;
            sumO=sumO+arr[i];
        }
    }
    System.out.println("Sum of even="+sumE+"\tSum of odd="+sumO);
    System.out.print("count of even="+eve+"\tcount of odd="+odd);
}
}


            
            