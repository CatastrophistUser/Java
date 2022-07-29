import java.util.*;
class Triangle1
{
    public static void main()
    {
        Scanner tr=new Scanner(System.in);
        System.out.println("Enter angle 1");
        System.out.println("Enter angle 2");
        System.out.println("Enter angle 3");
        int a=tr.nextInt();
        int b=tr.nextInt();
        int c=tr.nextInt();
        if (a+b+c==180)
        System.out.print("Triangle is valid");
        else
        System.out.print("Triangle is not valid");
    }
}

        
        