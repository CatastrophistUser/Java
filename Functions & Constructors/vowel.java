import java.util.*;
class vowel
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str,copy="",v="aeiouAEIOU";
        int i,l;
        char ch,ch1,ch2;
        System.out.print("Enter your string- ");
        str=sc.nextLine();
        str=str+" ";
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                ch1=copy.charAt(0);
                ch2=copy.charAt(copy.length()-1);
                if(v.indexOf(ch1)!=-1 && v.indexOf(ch2)!=-1)
                    System.out.print(copy +" ");
                copy="";
            }
            else
                copy+=ch;
        }
        }
    }
        
        
        
        
        