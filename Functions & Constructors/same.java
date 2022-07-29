import java.util.*;
class same
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str,copy="";
        int i,l;
        char ch,ch1,ch2;
        System.out.print("Enter your string- ");
        str=sc.nextLine();
        str=str+" ";
        str=str.toLowerCase();
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                ch1=copy.charAt(0);
                ch2=copy.charAt(copy.length()-1);
                if(ch1==ch2)
                System.out.println(copy);
                copy="";
            }
            else
            copy+=ch;
        }
    }
}
            