import java.util.*;
class niven //To check for a niven number.(Example:9)
{
    boolean isNiven(int n)
    {
        int d,c=0,n1=n,sq=n*n,s=0;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        {
            d=sq%(int) Math.pow(10,c);
            s=sq/(int) Math.pow(10,c);
            s=s+d;
        }
        if(s==n1)
        return true;
        else 
        return false;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        boolean f=false;
        System.out.print("Enter a no.");
        n=sc.nextInt();
        niven ob=new niven();
        f=ob.isNiven(n);
        if(f==true)
        System.out.print(n+"is a Niven number");
        else 
        System.out.print(n+"is not a Niven number");
    }
}
        