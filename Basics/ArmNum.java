import java.util.*;
class ArmNum //Ain't it obvious? It's Armstrong number using recursion.
{
int n;
int l;
ArmNum(int num)
{
  n=num;
  l=0;
        for(int i=n;i!=0;i/=10)
         i++;
}
int sumPow(int i)
{ 
    if(i<10)
          return(int)Math.pow(i,1);
          return(int)Math.pow(i%10,1)+sumPow(i/10);
}
  public void isArmstrong()
  {
      if(n==sumPow(n))
      System.out.println(n+"is Armstrong no.");
      else
      System.out.println(n+"is not an Armstrong no.");
  }
public static void main()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter no:");
int num = sc.nextInt();
ArmNum ob = new ArmNum(num);
ob.isArmstrong();
}
}