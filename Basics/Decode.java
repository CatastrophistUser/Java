import java.util.*;
class Decode //ISC Computer Practicals 2004,Q2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter encoded message:");
        String msg=sc.nextLine();
        int i=0,v=0,c;
        int l=msg.length();
        for(i=l-1;i>=0;i--)
        {
            c=msg.charAt(i)-48;
            v=v*10+c;
            if(v>=32)
            {
            System.out.print((char)v);
            v=0;
            }
        }
    }
}