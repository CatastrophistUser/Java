class recurDecToBin
{
    long FN(int n)
    {
        if(n==0)
            return 0;
            else
            return FN(n/2)*10+n%2;
        }
        public static void main()
        {
      recurDecToBin ob=new recurDecToBin();
      System.out.print(ob.FN(17));
    }
}
      