import java.util.*;
class Space
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       String str;
       int i,l,c=0;
       System.out.print("Enter your string");
       str=sc.nextLine();
       l=str.length();
       for(i=0;i<l;i++)
       {
          if(str.charAt(i)==' ')
          c++;
       }
          System.out.print(c);  //c+1==no.of words.
        }
    }

    