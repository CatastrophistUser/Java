import java.util.*;
class fall_through
{
    public static void main()
    {
        Scanner sm=new Scanner(System.in);
        System.out.print("Input your number");
int a=7;
        switch(a)
        {
            case 1:System.out.print("ONE");
            case 2:System.out.print("Hello");
                    break;
            case 3:System.out.print("THREE");
            case 4:System.out.print("Bye");
                    break;
            default:System.out.print("error");
        }
    }
}