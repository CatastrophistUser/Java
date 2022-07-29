import java.util.*;
class Triangle
{
    public static void main()
    {
        Scanner tr=new Scanner(System.in);
        System.out.println("Input first length");
        System.out.println("Input second length");
        System.out.println("Input third length");
        int a=tr.nextInt();
        int b=tr.nextInt();
        int c=tr.nextInt();
        if (a==b && a==c)
        System.out.print("Equilateral Triangle");
        else if (a==b || a==c || b==c)
        System.out.print("Isosceles Triangle");
        else
        System.out.print("Scalene Triangles");
    }
}
       