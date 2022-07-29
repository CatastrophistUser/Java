class cons1
{
    int a;
    cons1()
    {
        System.out.println("COnstructor called");
    }
    void fn()
    {
        System.out.print("Function called");
    }
    public static void main()
    {
        cons1 ob=new cons1();
        ob.fn();
    }
}
