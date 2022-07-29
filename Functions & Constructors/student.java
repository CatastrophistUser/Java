import java.util.*;
class student
{
String name;
int rollNo;
double marks;
char grade;
void input()
{
    Scanner sc1=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    System.out.print("ENter name");
    name=sc1.nextLine();
    System.out.print("ENter roll NO");
    rollNo=sc2.nextInt();
    System.out.print("ENter Marks");
    marks=sc2.nextDouble();
}
void display()
{
    if(marks>=90)
        grade='A';
       else if(marks>=80)
        grade='B';
      else if(marks>=60)
        grade='C';
      else
        grade='D';
    System.out.print("NAME\tROLL Number\tMARKS\tGRADE\n");
    System.out.print(name + "\t" + rollNo + "\t\t" + marks + "\t" + grade);
 }
}
 

    