 import java.util.*;
class nzero
{
    public static void main()
    {
        int n,i;
        Scanner nz=new Scanner(System.in);
        System.out.print("Input your number");
        n=nz.nextInt();
        for (i=n;i>=0;i--)
        {
            System.out.println(i);
        }
    }
}