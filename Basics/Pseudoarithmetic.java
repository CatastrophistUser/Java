import java.util.*;
class Pseudoarithmetic
{
   int n,ans,flag,sum,r,a[];
   Pseudoarithmetic()
   {
      n=0;
      flag = 0; 
      sum = 0;
   }
   void accept(int nn)
   {
    n = nn;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size= ");
    n=sc.nextInt();
    System.out.println("Enter sequence= ");
    for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
   }
   boolean check()
   {
      if(n%2==0)
      {
      int i=0,p=n-1;
      while (i < p)
      {
        r=a[i]+a[p];
        if (r==(a[i+1]+a[p-1] && (r*3)==sum))
        {
         flag = 0;
        }
        p = p-1;i = i + 1;
        if (n%2!=0)
        {
        int i,p=n-1;
        while (i<=p)
        {
         r=a[i]+a[p];
         if (r== (a [i +1] + a[p -1]) && (r*3) == sum)
         {
           flag = 0;
         }
       else
       {
         flag= 1;
       }
       p=p-1;i=i+1;
        }
        }
        if(flag==0)
        return true;
        else
        return false;
}
}
}
}
