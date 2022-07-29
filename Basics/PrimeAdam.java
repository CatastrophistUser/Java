import java.util.*;
class PrimeAdam  //To check if a number is prime as well as a Adam's number.
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("First no.= ");
        int m=sc.nextInt();
        System.out.print("Second no.= ");
        int n=sc.nextInt();
        if(m >= n)
        {
            System.out.println("Invalid");
            return;
        }
        int c=0;
        System.out.println("The Prime-Adam integers are:");
        for(int i=m;i<=n;i++)
        {
            if(isPrime(i))
            {
                int rev = reverse(i);
                int s1 = i * i;
                int s2 = rev * rev;
                if(reverse(s1) == s2)
                {
                    if(c == 0)
                        System.out.print(i);
                    else
                        System.out.print(", " + i);
                    c++;
                }
            }
        }
        if(c == 0)
            System.out.println("NIL");
        else
            System.out.println();
        System.out.println("Frequency of Prime-Adam integers is: " + c);
    }
    public static boolean isPrime(int n)
    {
        int f = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
                f++;
        }
        return f == 2;
    }
    public static int reverse(int n)
    {
        int rev = 0;
        for(int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
        return rev;
    }
}