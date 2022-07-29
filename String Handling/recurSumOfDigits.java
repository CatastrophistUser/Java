import java.util.*;
class recurSumOfDigits
{
 int fn(int n)
    {
        if(n==0)
            return 0;
            else
            return n%10+fn(n/10);
        }
        public static void main()
        {
            recurSumOfDigits ob=new recurSumOfDigits();
            System.out.println(ob.fn(1924));
        }
    }