import java.util.*;
class vowel
{
    public static void main()
    {
        Scanner vw=new Scanner(System.in);
        System.out.print("Input your alphabet");
        char a=vw.next().charAt(0);
        switch(a)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':System.out.print("Vowel");
                    break;
            default:System.out.print("not a vowel");
        }
    }
}