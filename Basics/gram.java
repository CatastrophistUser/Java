import java.util.*;
class gram
{
    public static void main()
    {
        Scanner gm=new Scanner(System.in);
        System.out.print("Input weight of product");
        int w=gm.nextInt();
        double GST,cost;
        if (w<=100)
        cost=30;
        else
            cost=(Math.ceil((w-100.0)/50))*20+30;
            GST=1.2*cost;
            System.out.println("Your cost="+cost);
            System.out.println("Your GST="+GST);
        }
    }

           