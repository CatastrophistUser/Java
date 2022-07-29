import java.util.*;
class Discount
{
    public static void main()
    {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        char ch;
        int a;
        double pr=0,rate=0,d,pay;
        System.out.println("L-LAPTOP\nD-DESKTOP");
        System.out.println("Enter your choice");
        System.out.println("Enter the Amount");
        ch=sc1.next().charAt(0);
        if (ch=='L')
        { 
        pr=sc2.nextDouble();
         if(pr<=25000)
         rate=0;
         else if (pr<=57000)
         rate=.05;
         else if (pr<100000)
         rate=.075;
         else
         rate=.1;
        }
        else if (ch=='D')
        {
        pr=sc2.nextDouble();
         if(pr<=25000)
         rate=.05;
         else if (pr<=57000)
         rate=.075;
         else if (pr<100000)
         rate=.01;
         else
         rate=.15;
        }
        d=pr*rate;
        pay=pr-d;
        System.out.print(pay);
    }
}
        
    