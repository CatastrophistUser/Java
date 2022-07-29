import java.util.*;
class Palindrome //This returns all Palindrome nos. b/w 100-500.
{
    int Reverse(int n)
    {
        int rev=0,d;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        return rev;
        
    }
    public static void main()
    {
        Palindrome ob=new Palindrome();
        int i;
        for(i=100;i<=500;i++)
        {
            if(i==ob.Reverse(i))
                System.out.print(i + " ");
                
        }
    }
}
    
        
        
            
        
        
        
        
            
        