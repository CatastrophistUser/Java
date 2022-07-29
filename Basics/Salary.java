import java.util.*;
class Salary
{
    public static void main()
    {
        Scanner sa=new Scanner(System.in);
        System.out.print("Input your Amount");
        int a=sa.nextInt();
        double HRA,DA,sal;
        if (a<=10000)
        {
        HRA=20.0/100*a;
        DA=80.0/100*a;
    }
        else if (a<=20000)
        {
        HRA=25.0/100*a;
        DA=90.0/100*a;
    }
        else
        {
        HRA=(30.0/100)*a;
        DA=(95.0/100)*a;
    }
    sal=a+HRA+DA;
    System.out.print("Salary= "+sal  +"HRA= "+HRA  +"DA= "+DA);
    }
}
