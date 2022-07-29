import java.util.*;
import java.io.*;
class Marks
{
    public static void main()throws IOException
    {
    Scanner sc=new Scanner(System.in);
    Scanner st=new Scanner(System.in);
    FileWriter FW=new FileWriter("Marks.txt");
    BufferedWriter BW=new BufferedWriter(FW);
    PrintWriter PW=new PrintWriter(BW);
    int i,marks,j;
    String name;
    for(i=1;i<=5;i++)
    {
        System.out.print("Enter name");
        name=st.nextLine();
        PW.print(name + ";");
        for(j=1;j<=3;j++)
        {
        System.out.print("Enter marks");
        marks=sc.nextInt();
        PW.print(marks + ";");
        }
        PW.println();
    }
    PW.close();
}
}
        