import java.util.*;
class Perfect
{
    public static void main()
    {
        Scanner sq=new Scanner(System.in);
        System.out.print("Input your Number");
        double n=sq.nextInt();
        if (Math.sqrt(n)==Math.round(Math.sqrt(n)))
        System.out.print("Perfect Square");
        else
        System.out.print("Not a Perfect Square");
    }
}