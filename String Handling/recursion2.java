class recursion2
{
    void fn(int i)
    {
        if(i<=3)
        {
            System.out.println(i);
            fn(++i);
        }
        else   
        System.out.println(i);
        
    }
    public static void main()
    {
        recursion2 ob=new recursion2();
        ob.fn(1);
    }
}