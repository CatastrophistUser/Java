import java.util.*;
class Triangle2
{
    public static void main()
    {
        Scanner ti=new Scanner(System.in);
        System.out.print("Enter side 1,2 & 3");
        int a=ti.nextInt();
        int b=ti.nextInt();
        int c=ti.nextInt();
        if (a+b<c)
        System.out.print("Invalid");
        else if (a+c<b)
        System.out.print("Invalid");
        else if (b+c<a)
        System.out.print("Invalid");
        else 
        System.out.print(" Valid");
    }
}
