import java.util.*;
class and
{
    public static void main()
    {
        Scanner ad=new Scanner(System.in);
        System.out.print("Input your alphabet");
        int a=ad.nextInt();
        int b=ad.nextInt();
        switch(a)
        {
            case 5:switch(b)
                  {
                      case 6:System.out.print("Hello");
                              break;
                              default:System.out.print("Error");
                  }          
                  break;
              default:System.out.print("Error");
                             
                            }
    }
}