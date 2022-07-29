import java.io.*;
import java.util.*;
class ReadMarks
{
    public static void main()throws IOException
    {
     Scanner sc=new Scanner(System.in);  
     FileReader FR=new FileReader("Marks.txt");
     BufferedReader BR=new BufferedReader(FR);
     FileWriter FW=new FileWriter("aggregate.txt");
    BufferedWriter BW=new BufferedWriter(FW);
    PrintWriter PW=new PrintWriter(BW);
     int pos,i;
     double s,mk;
     char ch;
     String str,name,M="";
     while((str=BR.readLine())!=null)
     {
         s=0;
         pos=str.indexOf(';');
         name=str.substring(0,pos);
         for(i=pos+1;i<str.length();i++)
         {
             ch=str.charAt(i);
             if(ch==';')
             {
                 mk=Double.parseDouble(M);
                 s=s+mk;
                 M="";
              }
                else
                M=M+ch;
            }
            PW.println(name + "\t" + s/3);
        }
        PW.close();
        BR.close();
    }
}