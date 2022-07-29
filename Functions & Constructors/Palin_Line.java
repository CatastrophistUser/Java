import java.util.*;
class Palin_Line
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string-");
        String str,s1="",s2="";
        str=sc.nextLine();
        str=str+" ";
        int i,l;
        char ch;
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
            if(s1.equalsIgnoreCase(s2))
                System.out.println(s1);
            s1="";
            s2="";
        }
        else
        {
            s1=s1+ch;
            s2=ch+s2;
        }
    }
}

}