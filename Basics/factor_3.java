import java.util.*;
class factor_3
{
public static void main()
{
    Scanner fa=new Scanner(System.in);
    int n,i;
    n=fa.nextInt();
    for (i=n;i>=0;i--)
    {
        if(n%i==0)
          
        System.out.println(i);
    }
}
}