import java.util.*;
class Series 
{
    int sumnterms(int n)
    {
        int i,d=0;
        for(i=1;i<=n;i++)
        {
            d=d+i;
        }
        return d;
    }
    double facto(int f)
    {
      int i;
      double c=1;
      for(i=1;i<=f;i++)
      {
          c=c*i;
      }
      return c;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,x,n,s;
        double fact,sum=0,p;
        Series ob=new Series();
        System.out.print("Enter value of x");
        x=sc.nextInt();
        System.out.print("Enter value of n");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=ob.sumnterms(i);
            p=Math.pow(x,s);
            fact=ob.facto(i);
            sum=sum+p/fact;
        }
        System.out.print(sum);
    }
}
    
        
          
         
       
            
      