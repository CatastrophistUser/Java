import java.util.*;
class switch1
{
    public static void main()
    {
        Scanner sm=new Scanner(System.in);
        System.out.print("Input your number");
        int b=16;
        int a=sm.nextInt();
        switch(a)
        {
            case 1:System.out.print("One");
                    break;
            case 2:System.out.print("Two");
                    break;
            case 3:System.out.print("Three");
                    break;
            case 4:System.out.print("Four");
                    break;
            default:System.out.print("error");
        }
    }
}