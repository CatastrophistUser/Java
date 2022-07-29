import java.util.*;
class library_fine
{
    public static void main()
    {
        Scanner lf=new Scanner(System.in);
        int d=lf.nextInt();
        double fine=0;
        if (d<=7)
        fine=0;
        else if(d<=14)
        fine=(d-7)*2;
        else if(d<=21)
        fine=(7*2)+(d-14)*4;
        else
        fine=(7*2)+(7*4)+(d-21)*6;
        System.out.print("Fine="+fine);
    }
}
