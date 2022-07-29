import java.util.*;
class Mixer
{
int arr[];
int n;
static Scanner sc=new Scanner(System.in);
Mixer(int nn)
{
n=nn;
arr=new int[n];
}
void accept()
{
System.out.println("Enter elements");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
}
Mixer mix(Mixer A)
{
Mixer B=new Mixer(n+A.n);
int a=0,b=0,c=0;
while(a<A.arr[b])
{
B.arr[c]=A.arr[b];
b++;
}
else
{
B.arr[b]=arr[a];
a++;
}
c++;
}
while(a<n)
B.arr[c++]=arr[a++];
while(y<A.n)
B.arr[c++]=A.arr[b++];
return B;
}
void display()
{
for(int i=0;i<n;i++)
System.out.println(arr[i]);
}
static void main()
R=P.mix(Q);
R. display();
}
}
