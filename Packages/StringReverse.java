//program to reverse a specified string
import java.util.*;
class StringReverse 
{
    public static void main(String[] args) {
        String s1=" ";
        String s2=" ";
        int l,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ant string:");
        s1=sc.next();
        l=s1.length();
        for(i=l-1;i>=0;i--)
        {
          s2=s2+s1.charAt(i);
        }
        System.out.println("Reverse String="+s2);
    }
}