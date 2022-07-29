import java.util.*;
class fibbprime   //To check if a number is fibonacci (starting with 0,1) as well as a prime number.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int i,n,a=0,b=1,c,s,j;
        n=sc.nextInt();
        for(i=1;i<=n;)
        { 
               c=a+b;
               s=0;
               for(j=1;j<=a;j++)
               {
                   if(a%j==0)
                    s++;
                }
               if(s==2)
               { 
               System.out.print(a+" ");
               i++;
            }
               a=b;
               b=c;
        }
        }
    }

            