import java.io.*;
import java.util.*;
class BufferMartix
{
 public static void main()throws IOException
    {
     Scanner sc=new Scanner(System.in);
     FileWriter FW=new FileWriter("Matrix.txt");
     BufferedWriter BW=new BufferedWriter(FW);
     PrintWriter PW=new PrintWriter(BW);
     int R,C,i,j,n;
     System.out.print("Enter rows");
     R=sc.nextInt();
     System.out.print("Enter cols");
     C=sc.nextInt();
     PW.println(R +" "+ C);
     for(i=0;i<R;i++)
     {
         for(j=0;j<C;j++)
            {
                n=sc.nextInt();
                PW.print(n + " ");
            }
            PW.println();
        }
        PW.close();
    }
}
