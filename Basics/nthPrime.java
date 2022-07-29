import java.util.*;
public class nthPrime
{
public static void main()
{
    Scanner sc=new Scanner(System.in);
    int n,num=3,i,c=1,fac;
    System.out.print("Enter a number");
    n=sc.nextInt();
    if(n==1)
        System.out.print(2);
       else
       {
    while(c<n)
    {
        fac=0;
        for(i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {    
                fac++;
                break;
            }
        }
        if(fac==0)
        {
           c++;
           if(c==n)
            System.out.print(num);
        }
        num+=2;
    }
}
}
}
          
    