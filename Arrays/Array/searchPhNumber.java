import java.util.*;
class searchPhNumber
{
    public static void main()
    {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        String name[]=new String[10];
        long phNo[]=new long[10];
        long ph;
        int i,p=-1;
        for(i=0;i<=9;i++)
        {
            System.out.print("Enter name");
            name[i]=sc1.nextLine();
            System.out.print("Enter Phone number");
            phNo[i]=sc2.nextLong();
        }
        
        System.out.print("Enter phone number to be searched");
        ph=sc2.nextLong();
        
        for(i=0;i<=9;i++)
        {
            if(ph==phNo[i])
            {
                p=i;
                break;
            }
        }
        if(p>=0)
            System.out.print("name" + name[p]);
         else
            System.out.print("no record found");
        }
    }