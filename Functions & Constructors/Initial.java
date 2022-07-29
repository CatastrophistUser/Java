import java.util.*;
class Initial
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,p=-1,l;
        String name;
        System.out.println("Enter name\t");
        name=sc.nextLine();
        name=' ' +name;
        l=name.length();
        p=name.lastIndexOf(' ');
         for(i=0;i<p;i++)
         {
           if(name.charAt(i)==' ')
           System.out.print(name.charAt(i+1)+".");
         }
         System.out.print(name.substring(p));
    }
}