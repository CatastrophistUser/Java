import java.util.*;
class sum
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,s=0,i;
        System.out.print("Enter size");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter " + n + " numbers");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
            for(i=0;i<n;i++)
                s=s+arr[i];
                
                System.out.print("Sum= " + s);
            }
        }