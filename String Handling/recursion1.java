class recursion1
{
    void fn(int i)
    {
        if(i<=10)
        {
            System.out.println("hello");

            fn(i+1);
        }
    }
    public static void main()
    {
        recursion1 ob=new recursion1();
        ob.fn(1);
    }
}