class recurArmStrong
{
   int fn(int n)
    {
        if(n==0)
            return 0;
            else
            return (int)Math.pow(n%10,3)+fn(n/10);
        }
        public static void main()
        {
            recurArmStrong ob=new recurArmStrong();
            System.out.print(ob.fn(257)==257);
        }
    }