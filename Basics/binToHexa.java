import java.util.*;
class binToHexa
{
    long bin;
    String hexa;
    binToHexa()
    {
        bin=0;
        hexa="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a binary number");
        bin=sc.nextLong();
    }
    void convert()
    {
        long d,v;
        int m;
        while(bin>0)
        {
            d=bin%10000;
            m=1;v=0;
            while(d>0)
            {
                v=v+d%10*m;
                m*=2;
                d/=10;
            }
            if(v<=9)
            hexa=v+hexa;
            else
            hexa=(char)(v+55)+hexa;
            bin/=10000;
        }
    }
    void display()
    {
        System.out.print(hexa);
    }
    public static void main()
    {
        binToHexa ob=new binToHexa();
        ob.input();
        ob.convert();
        ob.display();
    }
}