class cons2
{
    int a;
    cons2()
    {
    }
    
    cons2(int aa)
    {
       a=aa;
    }
    void display()
    {
        System.out.print(a);
    }
    public static void main()
    {
        int n;
        n=100;
        cons2 ob=new cons2(n);
        ob.display();
    }
}