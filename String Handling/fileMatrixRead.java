import java.io.*;
import java.util.*;
class fileMatrixRead
{
    public static void main()throws IOException
    {
     Scanner sc=new Scanner(System.in);  
     FileReader FR=new FileReader("Matrix.txt");
     BufferedReader BR=new BufferedReader(FR);
     int p1,i=0,j=0,k,R,l,C,c=0,n,count=0;
     char ch;
     String s1,s2;
     s1=BR.readLine();
     p1=s1.indexOf(' ');

     R=Integer.parseInt(s1.substring(0,p1));
     C=Integer.parseInt(s1.substring(p1+1));
     int mat[][]=new int[R][C];
     while((s1=BR.readLine())!=null)
     {
         p1=0;j=0;
         for(k=0;k<s1.length();k++)
         {
             ch=s1.charAt(k);
             if(ch==' ')
             {
                 n=Integer.parseInt(s1.substring(p1,k));
                 mat[i][j++]=n;
                 p1=k+1;
                 c=0;
                 for(l=1;l<=n;l++)
                 {
                     if(n%l==0)
                        c++;
                    }
                    if(c==2)
                        count++;
                    
                }}
                i++;
            }
            for(i=0;i<R;i++)
            {
                for(j=0;j<C;j++)
                    System.out.print(mat[i][j] + "\t");
                    System.out.println();
                }
            System.out.print("Prime = " + count);
            }
        }