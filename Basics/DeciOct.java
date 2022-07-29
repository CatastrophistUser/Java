import java.util.*;
class DeciOct
{
   int n,Oct;
   DeciOct()
   {
     n=0;
     Oct=0;
   }
   void getnum(int nn)
   {
      n=nn;
   }
   void deci_oct( )
   {
      int t=n,r=0,s;
      while (t!=0)
   {
      s=t%8;
      r=10*r+s;
}
Oct=0;
while (r!=0)
{
int p=r%10;
Oct=10*Oct+p;
r=r/10;
}
}
void show( )
{
       System.out.println ("The decimal number is"+n);
       System.out.println ("The octal is"+Oct);
}
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value in decimal= ");
    n=sc.nextInt();
    DeciOct ob=new DeciOct();
    ob.getnum(nn);
    ob.deci_oct();
    ob.show();
    }
}