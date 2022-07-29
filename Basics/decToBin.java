import java.util.*;
class decToBin
{
    double dec,bin;
    decToBin()
    {
        dec=0;
        bin=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a decimal number");
        dec=sc.nextDouble();
    }
    void convert()
    {
        int d,D,i;
        D=(int)dec;
        double m=1,D1=dec-D,a;
        while(D>0)
        {
            d=D%2;
            bin=bin+d*m;
            D/=2;
            m*=10;
        }
        m=10;
        for(i=1;i<=3;i++)
        {
            d=(int)(D1*2);
            bin=bin+d/m;
            D1=D1*2-d;
            m*=10;
        }
            
    }
    void display()
    {
        System.out.print(bin);
    }
    public static void main()
    {
        decToBin ob=new decToBin();
        ob.input();
        ob.convert();
        ob.display();
    }
}