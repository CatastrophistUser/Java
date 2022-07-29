import java.util.*;
class Search //To print the index no. of num(user input) if it exists.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,num,p=-1,c=0;
        System.out.print("Enter size of array");
        n=sc.nextInt(); 
      int arr[]=new int[n];
        System.out.print("Enter array elements");
        for(i=0;i<n;i++)
          arr[i]=sc.nextInt(); 
      System.out.print("Enter searching element");
        num=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c++;
            if(num==arr[i])
            {
                p=i;
                break;
            }
        }
            if(p>=0)
            System.out.print("No. exists at"+p);
            else
            System.out.print("No. does not exists");

    }
}
