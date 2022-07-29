import java.io.*;
import java.util.*;
class binFile  //Write Binary file.
{
    public static void main()throws Exception
    {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
        FileOutputStream FOS=new FileOutputStream("stu.dat");
        DataOutputStream DOS=new DataOutputStream(FOS);
        Scanner sc=new Scanner(System.in);
        String name;int i,roll;
        for(i=1;i<=5;i++)
        {
            System.out.print("name");
            name=(br.readLine());
            DOS.writeUTF(name);
            System.out.print("roll number");
            roll=Integer.parseInt(br.readLine());
            DOS.writeInt(roll);
        }
        DOS.close();
        FOS.close();
    }
        catch(IOException e)
        {
            System.out.print(e);
        }
    }
}