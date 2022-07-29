import java.util.*;
class hexaToBin
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String hexa,bin="",t;

        int m,v,i,ch;
        System.out.print("Enter a hexa decimal number");
        hexa=sc.nextLine();
        for(i=hexa.length()-1;i>=0;i--)
        {
            ch=hexa.charAt(i);
            if(ch>=48&&ch<=57)
                ch-=48;
              else
                ch-=55;
            t="";
            while(ch>0)
            {
                t=ch%2+t;
                ch/=2;
            }
            //System.out.println(t);
            while(t.length()!=4)
                t=0+t;
            bin=t+bin;
        }
        while(bin.charAt(0)=='0')
            bin=bin.substring(1);
        System.out.print(bin);
    }
}