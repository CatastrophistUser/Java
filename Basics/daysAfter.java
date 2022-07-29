import java.util.*;
class daysAfter //SH Preboards 2, Q1
{
    static String add(int n)
    {
        if(n/10!=1)
        {
            if(n%10==1)
            return "st";
            else if(n%10==2)
            return "nd";
            else if (n%10==3)
            return "rd";
            else
            return "th";
        }
        else                   //Yeah this is not a misprint
        return "th";
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,copy,after=0,year;
        int arr[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        String month[]={"","JAN","FEB","MAR","APR","MAY","JUNE","JULY","AUG","SEPT","OCT","NOV","DEC"};
        System.out.println("Enter days:");
        n=sc.nextInt();
        System.out.println("Enter year");
        year=sc.nextInt();
        copy=n;
        int i=1;
        for(int j=1;j<=2;j++,i=1)
        {
            while(copy>arr[i])
            {
                if(year%4==0 && year%100!=0 || year%400==0)
                arr[2]=29;
                copy-=arr[i++];
                if(i==13)
                {
                    i=1;
                    year++;
                }
            }
            System.out.println(copy+ daysAfter.add(copy)+" "+month[i]+" "+year);
            if(j==1)
            {
                System.out.print("Enter days after");
                after=sc.nextInt();
            }
            copy=n+after;
        }
    }
}