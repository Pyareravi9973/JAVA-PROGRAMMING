//Enter any number abd reverse it content
import java.util.*;
class StrReverse 
{
    public static void main(String[] args) {
        String s1=" ";
        String s2=" ";
        int i,l;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String:");
        s1=sc.next();
        l=s1.length();
        for(i=l-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        System.out.println("Reversed String="+s2);
    }
}