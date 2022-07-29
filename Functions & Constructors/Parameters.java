class Parameters //Intro to parameters in Methods.
{
    void sum(int a, int b) //Formal Parameters.
    {
        int s;
        s=a+b;
        System.out.print(s);
    }
    public static void main()
    {
     Parameters ob=new Parameters();
     int a,b;
     a=5;
     b=8;
     ob.sum(a,b); //Actual Parameters.
    }
}

        
        
        
    
    