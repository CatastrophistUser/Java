import java.util.*;
class Square //To print an array of 10 and another to print the squares of those elements.
{
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    int i,sq=1;
    int A[]=new int[10];
    int B[]=new int[10];
for(i=0;i<10;i++)
    A[i]=sc.nextInt();
for(i=0;i<10;i++)
    B[i]=A[i]*A[i];
for(i=0;i<10;i++)
System.out.println(B[i]);
     }
}
    
    