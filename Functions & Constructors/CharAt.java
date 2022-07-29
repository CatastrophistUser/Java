import java.util.*;
class CharAt
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       String str;
       int i,l;
       System.out.print("Enter your string");
       str=sc.nextLine();
       l=str.length();
       for(i=0;i<l;i++)
       {
          System.out.println(str.charAt(i));
        }
    }
}
       
        