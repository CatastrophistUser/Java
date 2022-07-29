import java.util.*;
class Factorial 
{
    int Fact(int n)
    {
    int i,F=1;
    for(i=1;i<=n;i++)
    F=F*i;
    return F;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Factorial ob=new Factorial();
        int n,i=1,s=1;
        n=sc.nextInt();
        s=ob.Fact(n);
        System.out.print(s);
    }
}


    