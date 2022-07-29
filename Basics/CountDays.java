import java.util.*;
class CountDays   //Calculate number of days b/w two given dates. Format: dd/mm/yyyy
{
boolean isLeap(int Y)
{
if((Y%4==0 && Y%100!=0)||Y%400==0)
    return true;
 else
    return false;
}
public static void main(String ar[])
{
CountDays ob=new CountDays();
Scanner sc=new Scanner(System.in);
String Date1,Date2;
int arr[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
int i,p1,p2,d1,d2,m1,m2,y1,y2,days=0;
System.out.print("Enter date1: ");
Date1=sc.nextLine();
System.out.print("Enter date2: ");
Date2=sc.nextLine();
p1=Date1.indexOf('/');
p2=Date1.lastIndexOf('/');
d1=Integer.parseInt(Date1.substring(0,p1));
m1=Integer.parseInt(Date1.substring(p1+1,p2));
y1=Integer.parseInt(Date1.substring(p2+1));
p1=Date2.indexOf('/');
p2=Date2.lastIndexOf('/');
d2=Integer.parseInt(Date2.substring(0,p1));
m2=Integer.parseInt(Date2.substring(p1+1,p2));
y2=Integer.parseInt(Date2.substring(p2+1));
if(y1==y2 && m1==m2)
days=d2-d1;
else
{
for(i=y1+1;i<y2;i++)
{
    if(ob.isLeap(i))
        days+=366;
     else
     days+=365;
}
if(y2!=y1)
{
for(i=m1+1;i<=12;i++)
    days+=arr[i];
for(i=1;i<m2;i++)
    days+=arr[i];
}
else
{
for(i=m1+1;i<m2;i++)
    days+=arr[i];
}
days+=arr[m1]-d1+d2;
if(ob.isLeap(y1)&&m1<=2)
    days++;
if(ob.isLeap(y2)&& m2>2 && y1!=y2)
    days++;
} 
System.out.print(days+"Days");
}
}