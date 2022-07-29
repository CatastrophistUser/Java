class recurDecToOct
{
    long FN(int n)
    {
        if(n==0)
            return 0;
            else
            return FN(n/8)*10+n%8;
        }
        public static void main()
        {
      recurDecToOct ob=new recurDecToOct();
      System.out.print(ob.FN(35));
    }
}
      