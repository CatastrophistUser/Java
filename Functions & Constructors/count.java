import java.util.*;
class count
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str,wrd="",v="aeiouAEIOU";
        int i,l,c=0;
        char ch;
        System.out.print("Enter your string-");
        str=sc.nextLine();
        str=str+" ";
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                System.out.println(wrd + "\t\t" + wrd.length() + "\t" + c);
                wrd="";
                c=0;
            }
            else
            {
                wrd+=ch;
                if(v.indexOf(ch)!=-1)
                    c++;
                }
            }
        }
    }