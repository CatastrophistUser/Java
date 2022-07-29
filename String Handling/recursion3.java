import java.util.*;
class recursion3   //To print with a^b without Math.pow().
{
    double power(int a, int b)
    {
        if(b==0)
        return 1;
        else if(b>0)
        return a*power(a,b-1);
        else
        return 1.0/a*power(a,b+1);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter");
        int a=sc.nextInt();        
        int b=sc.nextInt();
        recursion3 ob=new recursion3();
        System.out.print(ob.power(a,b));
    }
}
