import java.util.*;
class BinarySearch
{
String arr[];
int size,low,high;
static Scanner sc=new Scanner(System.in);
BinarySearch(int s)
{
    size=s;
    low=0;
    high=s-1;
    arr=new String [size];
}
void input()
{
int i;
    for(i=0;i<size;i++)
        arr[i]=sc.nextLine();

}
int BSearch(String s)
{
int mid;
if(low>high)
    return -1;
    mid=(low+high)/2;
//    System.out.println(mid);
    if(s.compareToIgnoreCase(arr[mid])<0)
        low=mid+1;
    else if(s.compareToIgnoreCase(arr[mid])>0)
        high=mid-1;
    else 
        return mid;
    return BSearch(s);
}



public static void main()
{
    int s;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter array size");
    s=sc.nextInt();
    BinarySearch ob=new BinarySearch(s);
    ob.input();
    System.out.print(ob.BSearch("ZNDJ"));
}
}