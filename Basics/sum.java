import java.util.*;
class sum
{
    public static void main()
    {
int a;
        Scanner sm=new Scanner(System.in);
        System.out.print("Input your number");
//        int a=sm.nextInt();
  for(a=10;a<=99;a++)
  {
          int b=a%10;
        int c=a/10;
        if (a==(b+c)+(b*c))
        System.out.println("Special number" + a);}
   //     else 
     //   System.out.print("Not a special number");
    }
}
        