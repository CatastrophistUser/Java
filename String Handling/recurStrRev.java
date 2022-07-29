import java.util.*;
class recurStrRev
{
    String rev(String s)
    {
        if(s.length()==0)
            return "";
           else
           return rev(s.substring(1))+s.charAt(0);
        }
        public static void main()
        {
          recurStrRev ob=new recurStrRev();
          System.out.print(ob.rev("PRANJAL"));
    }
}
