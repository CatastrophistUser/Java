import java.util.*;
class Name2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string ");
        int i,j;
        String str;
        str=sc.nextLine();
        for(i=0;i<str.length();i++)
        {
            for(j=i;j>=0;j--)
            System.out.print(str.charAt(j));
            System.out.println();
        }
    }
}