import java.util.*;
class Caesar //Implement the Caesar cipher (ROT13 Protocol).
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        int l=s.length();
        if(l<4 || l>99)
        {
            System.out.println("Invalid");
            return;
        }
        String ns="";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if ((ch>='A' && ch<='Z') && (ch>90) || (ch>='a' && ch<='z') && (ch<120))
            {
                chn=(char)(chn-26);
            }
            chn=ch;
        }
        ns=ns+ch;
    }
    System.out.println("The ciphered text is="+ ns);
}
