import java.util.*;
class BookFair
{
String Bname;
double price;
BookFair()
{
    Bname="";
    price=0;
}
void input()
{
    Scanner cs=new Scanner(System.in);
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name of book:");
    Bname=cs.nextLine();
    System.out.println("Enter price of book:");
    price=sc.nextDouble();
}
void calculate()
{
    if (price<=1000)
    price=price-((2.0/100)*price);
    else if(price<=3000)
    price=price-((10.0/100)*price);
    else
    price=price-((15.0/100)*price);
    System.out.println("Price of book after discount: "+price);
        System.out.print("Name of book: "+Bname);
}
public static void main()
{
    BookFair ob=new  BookFair();
    ob.input();
    ob.calculate();
}
}

    

    
    
    
    
    
    