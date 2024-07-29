//Enter two string and compare both the string
import java.util.*;
class StrCompare 
{
    public static void main(String[] args) {
        String s1=" ";
        String s2=" ";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st String:");
        s1=sc.next();
        System.out.println("Enter 2nd string:");
        s2=sc.next();
        if(s1.compareTo(s2)==0)
        {
            System.out.println("Both string are equal!");
        }
        else{
            System.out.println("Both string are not equal!");
        }
         
    }
}