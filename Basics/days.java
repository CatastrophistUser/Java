import java.util.*;
class days
{
public static void main()
{
Scanner dy=new Scanner(System.in);
System.out.println("Enter Amount");
System.out.println("Enter Time");
int a=dy.nextInt();
int d=dy.nextInt();
double rate=0;
if(d<=400)
rate=(7.5/100)*a;
else if(d<=600)
rate=(8.5/100)*a;
else if(d<=800)
rate=(9.5/100)*a;
else
System.out.print("ERROR!");
System.out.print("Maturity Amount="+Math.round(a+rate));
}
}

