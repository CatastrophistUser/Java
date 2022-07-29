import java.util.*;
class Electric_Bill
{
    String n;
    int units;
    double bill;
    void accept() 
    {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.print("Enter customer name");
        n=sc1.nextLine();
        System.out.print("Enter number of units");
        units=sc2.nextInt();
    }
    void calculate()
    {
        if(units<=100)
        bill=2.0*units;
        else if(units<=300)     
        bill=(100*2.0)+(units-100)*3.0;
        else
        {
        bill=(100*2.0)+(200*3.0)+(units-300)*5;
        bill=bill+.025*bill;
        }
    }
    void print()
    {
        System.out.println("NAME-" + n);
        System.out.println("UNITS-" + units);
        System.out.println("Bill-" + bill);
    } 
    public static void main()
    {
        Electric_Bill ob=new Electric_Bill();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}