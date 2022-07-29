import java.util.*;
class subject
{
    public static void main()
    {
        Scanner sb=new Scanner(System.in);
        System.out.print("Input your number");
        char ch=sb.next().charAt(0);
        switch(ch)
        {
            case 'A':
            case 'a':System.out.print("Algebra");
                    break;
            case 'B':        
            case 'b':System.out.print("Biology");
                    break;
            default:System.out.print("invalid");
        }
    }
}