import java.util.*;
class sortWords  //Preboards 2, Q3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String str,temp;
        int i,p=0,l,p1=0,j;
        char ch;
        String arr[]=new String[10];
        System.out.print("Enter a sentence");
        str=sc.nextLine();
        l=str.length();
        for(i=0;i<l;i++)
        {
            ch=str.charAt(i);
            if(ch==' ' || ch=='.' ||ch=='?' || ch=='!')
            {
                arr[p1++]=str.substring(p,i);
                p=i+1;
            }
        }
        for(i=0;i<p1;i++)      //Bubble Sorting
        {
            for(j=0;j<p1-1-i;j++)
            {
                if(arr[j].length()>arr[j+1].length())
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(str);    //Print Original String.
        System.out.print(Character.toUpperCase(arr[0].charAt(0)) + arr[0].substring(1));
        for(i=1;i<p1;i++)
        System.out.print(" " + arr[i]);
        System.out.print(str.charAt(l-1));
    }
}              