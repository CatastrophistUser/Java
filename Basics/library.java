import java.util.*;
class library
{
    public static void main()
    {
        Scanner lb=new Scanner(System.in);
        System.out.print("Input number of days");
        int d=lb.nextInt();
        double fine=0;
          if (d<=7)
           fine=0;
           else if (d<=14)
           fine=(d-7)*2;
           else if (d<=21)
           fine=7*2+(d-14)*4;
           else if (d>21)
           fine=(d-21)*8+(7*4)+(7*2);
           System.out.print("Fine="+fine);
        }
    }

    