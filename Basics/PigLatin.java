import java.util.*;
class PigLatin  //Piglatin String: first all vowels of a word + consonants + "AY".
{
    String p,s;
    PigLatin()
    {
        p="";
        s="";
    }
    PigLatin(String ss)
    {
        p="";
        s=ss;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        s=sc.nextLine();
        s=s.toUpperCase();
    }
    void conv()
    {
        int len=s.length();
        String v="aeiouAEIOU";
        String w1="";
        String w2="";
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            if(v.indexOf(ch)!=-1)
            {
                w1=s.substring(i);
                w2=s.substring(0,i);
                break;
            }
        }
        p=w1+w2+"AY";
    }
    void display()
    {
        System.out.println("Original String: "+s);
        System.out.println("Piglatin Form: "+p);
    }
    public static void main()
    {
        PigLatin ob=new PigLatin();
        ob.input();
        ob.conv();
        ob.display();
    }
}