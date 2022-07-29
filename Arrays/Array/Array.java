import java.util.*;
class Array   //Intro to Arrays. And i don't know what this code does!
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int i;
        for(i=0;i<=9;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<=9;i++)
        System.out.println(arr[i]);
        
        System.out.print(arr);
    }
}