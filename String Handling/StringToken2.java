import java.util.*;
class StringToken2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int c,sum=0,i;
        String s;
        System.out.print("Enter sequence of integers");
        s=sc.nextLine();
        StringTokenizer ST=new StringTokenizer(s,",");
        c=ST.countTokens();
        System.out.println("C=" + c);
        for(i=1;i<=c;i++)
//        sum=sum+new Integer(ST.nextToken()).intValue();
        sum=sum+Integer.parseInt(ST.nextToken());      
        System.out.print(sum);
    }
}