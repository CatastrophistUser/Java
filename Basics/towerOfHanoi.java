class towerOfHanoi
{
    void fn(int n,int from,int to)
    {
        int temp;
        if(n==1)
        System.out.println(from + "->" + to);
        else
        {
            temp=6-from-to;
            fn(n-1,from,temp);
            System.out.println(from + "->" + to);
            fn(n-1,temp,to);
        }
    }
    public static void main()
    {
        towerOfHanoi ob=new towerOfHanoi();
        ob.fn(4,1,2);
    }
}
        