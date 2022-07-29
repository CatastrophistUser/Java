import java.util.*;
class callByRef
{
    void sum(int arr[])
    {
        int i,s=0;
        for(i=0;i<arr.length;i++)
               arr[i]+=2;
        

        
    }
    public static void main()
    {
        int arr[]={4,7,1,16,2};
        int i;
        Scanner sc=new Scanner(System.in);

        
            callByRef ob=new callByRef();
        
            ob.sum(arr);
            for(i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        }
    }
            
    