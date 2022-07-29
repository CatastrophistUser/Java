import java.util.*;
class RevString
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str,s="";
        str=sc.nextLine();
        int i;
        for(i=0;i<str.length();i++)
        s=str.charAt(i)+s;
        System.out.print(s);
    }
}
        