//Wap to enter any line of text and display its total character , word and blank space
import java.util.*;
class StrTextLine 
{
    public static void main(String[] args)
    {
        String s1=" ";
        int l,c,w,i,b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line of text:");
        s1=sc.nextLine();
        l=s1.length();
        for(i=0;i<l;i++)
        {
            if(s1.charAt(i)==' ')
            {
               b++;
            }
        }
        w=b+1;
        c=l-b;
        System.out.println("Total Word="+w);
        System.out.println("Total character="+c);
        System.out.println("Total blank space="+b);
    }
}