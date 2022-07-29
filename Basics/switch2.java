import java.util.*;
class switch2
{
    public static void main()
    {
        Scanner sm=new Scanner(System.in);
        System.out.print("Input your number");
        int a=sm.nextInt();
        switch(a)
        {
            case 1:System.out.print("Hello");
                    break;
            case 2:System.out.print("Hello");
                    break;
            case 3:System.out.print("Bye");
                    break;
            case 4:System.out.print("Bye");
                    break;
            default:System.out.print("error");
        }
    }
}