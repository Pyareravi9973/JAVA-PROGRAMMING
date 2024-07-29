//program to enter a string from keyboard and check how many vowels and consonent are present
import java.util.*;
class VowelConsonent 
{
    public static void main(String[] args) {
        String s1=" ";
        int l,i,v=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        s1=sc.next();
        s1=s1.toUpperCase();
        l=s1.length();
        for(i=0;i<l;i++)
        {
            if((s1.charAt(i)=='A')||(s1.charAt(i)=='E')||(s1.charAt(i)=='I')||(s1.charAt(i)=='O')||(s1.charAt(i)=='U'))
            {
                v++;
            }
            else
            {
                c++;
            }
        }
        System.out.println("Total vowels="+v);
        System.out.println("Total consonents="+c);
    }
}
