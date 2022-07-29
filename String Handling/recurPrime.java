class recurPrime
{
    boolean isPrime(int n,int i)
    {
        if(n==i)
            return true;
           else if(n%i==0)
            return false;
        else
            return isPrime(n,i+1);
        }
        public static void main()
        {
            recurPrime ob=new recurPrime();
            System.out.print(ob.isPrime(37,2));
        }
    }