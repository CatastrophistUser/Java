import java.util.*;
public class WordsFrequency
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("INPUT: ");
        String s = sc.nextLine();
        s=s.toUpperCase();
        int l = s.length();
        int nsent=0;
        String s1 = "";
        String s2 = "";
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(nsent==0)
            {
                    s1=s1+ch;  //creating sentence 1
            }
            if(nsent==1)
            {
                    s2=s2+ch;  //creating sentence 2
            }
            if(ch== '.' || ch =='?' || ch =='!')
            {
                nsent++;      // counting sentences
            }
        }
        s1=s1.trim(); // Removing trailing spaces
        s2=s2.trim(); // Removing trailing spaces
        
        // validity check for number of sentences
        if(nsent!=2) 
        {
            System.out.println("\nINVALID INPUT");
            return;
        }
        char lch1 = s1.charAt(s1.length()-1); // extracting last character of sentence 1
        char lch2 = s2.charAt(s2.length()-1); // extracting last character of sentence 2
        
        // validity check for the last character
        if((lch1 != '.' && lch1 !='?' && lch1 !='!') || (lch2 != '.' && lch2 !='?' && lch2 !='!'))  
        {
            System.out.println("\nINVALID INPUT");
            return;
        }
        
        System.out.println();
        // displaying the two sentences
        System.out.println(s1);
        System.out.println(s2);
        
        // breaking the whole paragraph into words and putting the words into an array
        StringTokenizer sts = new StringTokenizer(s,"?.! ");
        int nw = sts.countTokens();
        String words[] = new String[nw];
        for(int i=0;i<nw;i++)
        {
            words[i] = sts.nextToken();
        }
        
        // breaking the first sentence into words and putting the words into an array
        StringTokenizer st1 = new StringTokenizer(s1,"?.! ");
        int nw1 = st1.countTokens();
        String words1[] = new String[nw1];
        for(int i=0;i<nw1;i++)
        {
            words1[i] = st1.nextToken();
        }
        
        // breaking the second sentence into words and putting the words into an array
        StringTokenizer st2 = new StringTokenizer(s2,"?.! ");
        int nw2 = st2.countTokens();
        String words2[] = new String[nw2];
        for(int i=0;i<nw2;i++)
        {
            words2[i] = st2.nextToken();
        }
        
        String common[] = new String[nw]; // Array for common words
        int k=0;
        // Finding common words and form an array of common words
        for(int i=0;i<nw1;i++)
        {
            for(int j=0;j<nw2;j++)
            {
                if(words1[i].equalsIgnoreCase(words2[j]))
                {
                    words2[j]="";
                    common[k++] = words1[i];
                }
            }
        }
        if(k==0) // condition for no common words
        {
            System.out.println("\nNO COMMON WORDS");
            return;
        }
        
        
        System.out.println("\nCOMMON WORDS" + "\t\t" + "FREQUENCY");
        // Finding and displaying the frequency of common words of two sentence in the paragraph
        for(int i=0;i<k;i++)
        {
            int freq=0;
            for(int j=0;j<nw;j++)
            {
                if(common[i].equalsIgnoreCase(words[j]))
                {
                    freq++;
                }
            }
            System.out.println(common[i] + "\t\t\t" + freq);
        }

    }
}