import java.util.*;
class CapandSmall
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str;
        int i,c=0,s=0;
        char ch;
        System.out.print("Enter your string");
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            c++;
            else if(Character.isLowerCase(ch))
            s++;
        }
        System.out.print("Capital="+c+"\nSmall="+s);;
    }
}
           
            
        