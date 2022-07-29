
import java.util.*;
class Employee
{
    public static void main()
    {
        Scanner sc1=new Scanner(System.in);
        String name;
        System.out.print("enter the name");
        name=sc1.nextLine();
        int code,basic;
        double da,hra,net;
        Scanner sc2=new Scanner(System.in);
        System.out.print("enter employee code");
        code=sc2.nextInt();
        System.out.print("enter basic salary");
        basic=sc2.nextInt();
        da=.5*basic;
        hra=.3*basic;
        net=basic+da+hra;
        System.out.println("Name\tEmpCode\tBasic Salary\tDA\tHRA\tNet");
        System.out.println(name+"\t"+code+"\t\t"+basic+"\t\t"+da+"\t"+hra+"\t"+net);
    }
}