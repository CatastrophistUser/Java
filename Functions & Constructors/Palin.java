import java.util.*;
class Palin
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string");
        String str,s="",copy;
        str=sc.nextLine();
        int i;
        copy=str;
        for(i=0;i<str.length();i++)
        s=str.charAt(i)+s;
        System.out.print(s);
        if(str.equalsIgnoreCase(s))
        System.out.print("Palindrome String");
        else
        System.out.print("Not a Palindrome String");
    }
}
