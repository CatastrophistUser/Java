import java.util.*;
class Name5 
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter no of lines ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            if(j%2==1)
            System.out.print('@');
            else
            System.out.print('#');
            System.out.println();
        }
    }
}
            