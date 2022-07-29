import java.util.*;
class Capital   //Recreate using if(ch==' ' || ch==' ?' ||ch=='!')
{
    String sent;
    Capital()
    {
        sent=" ";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        sent=sc.nextLine();
    }
    boolean isCap(String w)
    {
        char ch=w.charAt(0);
        if(Character.isLetter(ch) && Character.isUpperCase(ch))
        return true;
        else
        return false;
    }
    void display()
    {
        // StringTokenizer sc1=new StringTokenizer(sent,"!?.");
        // int c=sc1.countTokens();
        int f=0;
        int c=
        for(int i=1;i<=c;i++)
        {
            // String nex=sc1.nextToken();
            if(isCap(nex))
            f++;
        }
        System.out.println("Sentence is= "+sent);
        System.out.println("Frequency of words= "+f);
    }
    public static void main()
    {
        Capital ob=new Capital();
        ob.input();
        ob.display();
    }
}
        