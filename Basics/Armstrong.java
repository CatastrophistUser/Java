import java.util.*;
class Armstrong
{
    int num,d;
    Armstrong()
    {
        num=0;
        d=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        num=sc.nextInt();
    }
    void countDigit()
    {
        int copy=num;
        while(copy>0)
        {
            d++;
            copy/=10;
        }
    }
    void check()
    {
        int copy,s=0,dig;
        copy=num;
        countDigit();
        while(copy>0)
        {
            dig=copy%10;
            s=s+(int)Math.pow(dig,d);
            copy/=10;
        }
        if(s==num)
            System.out.print("Armstrong");
        else
            System.out.print("Not an armstrong");
        }
        public static void main()
        {
            Armstrong ob=new Armstrong();
            ob.input();
            ob.check();
        }
    }