import java.util.*;
class toggleCase
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String st,st1="";
        char ch;
        int i,c=0,s=0;
        System.out.print("Enter your string\n");
        st=sc.nextLine();
        for(i=0;i<st.length();i++)
        {
            ch=st.charAt(i);
            if(Character.isUpperCase(ch)) //if(ch>=65 && ch<=90)
                ch+=32;
            else if(Character.isLowerCase(ch)) //else if (ch>=97 && ch<=122) 
                ch-=32;
             st1+=ch;   
        }
        System.out.print(st1);
    }
}
        