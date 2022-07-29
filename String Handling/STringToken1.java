import java.util.*;
class STringToken1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();  //"This: is: a:computer: science:class";
        StringTokenizer ST=new StringTokenizer(s,";");
        int i,W,l;
        
        l=s.length();
        W=ST.countTokens();
        System.out.println(l);
        System.out.println(W);
        for(i=1;i<=W;i++)
            System.out.println(ST.nextToken());
    }
}
