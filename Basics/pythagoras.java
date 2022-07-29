import java.util.*;
class pythagoras
{
    public static void main()
    {
        Scanner pg=new Scanner(System.in);
        System.out.println("Input length of first angle");
        System.out.println("Input length of second angle");
        int a=pg.nextInt();
        int b=pg.nextInt();
        int c=(a*a)+(b*b);
        System.out.print(Math.sqrt(c));
    }
}
        
        
           
            