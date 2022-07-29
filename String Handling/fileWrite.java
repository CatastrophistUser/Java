import java.util.*;
import java.io.*;
class fileWrite
{
    public static void main()throws IOException
    {
    Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    FileWriter FW=new FileWriter("C:\\Users\\user\\Desktop\\student.txt",true);
    BufferedWriter BW=new BufferedWriter(FW);
    PrintWriter PW=new PrintWriter(BW);
    int i;
    long mob;
    String name;
    for(i=1;i<=2;i++)
    {
        System.out.print("Enter name");
        name=sc1.nextLine();
        System.out.print("Enter mobile");
        mob=sc2.nextLong();
        PW.println(name +";" + mob);
    }
    PW.close();
    BW.close();
    FW.close();
}
}