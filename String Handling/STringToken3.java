import java.util.*;
class STringToken3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s="This is a computer science class";
        StringTokenizer ST=new StringTokenizer(s);
        while(ST.hasMoreTokens())
            System.out.println(ST.nextToken());
        System.out.print("OVER");
        }
    }
        