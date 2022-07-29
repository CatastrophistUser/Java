import java.util.*;
class Name3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string ");
        int i,j;
        String st;
        st=sc.nextLine();
       for(i=0;i<st.length();i++)
         {
             for(j=0;j<=i;j++)
             System.out.print(st.charAt(i));
             System.out.println();
            }
        }
    }