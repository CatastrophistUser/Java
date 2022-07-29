import java.util.*;
class fine
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int D;
        double Fine;
        System.out.print("Input number of days");
        D=sc.nextInt();
        if (D<=7)
        Fine=0;
        else if (D<=14)
        Fine=(D-7)*2;
        else if (D<=21)
        Fine=7*2+(D-14)*4;
        else
        Fine=7*2+7*4+(D-21)*6;
        System.out.print(Fine);
    }
}

        
        