import java.util.*;
class Name6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string");
        String st;
        st=sc.nextLine();
        int i,j,l;
        l=st.length();
        for(i=l-1;i>=0;i--)
        {
        for(j=i;j>=0;j--)
            System.out.print(st.charAt(j));
            System.out.println();
        }
    }
}
    

        