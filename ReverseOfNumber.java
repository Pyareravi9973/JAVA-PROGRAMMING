//Enter any number and display its reverse
import java.util.*;
class ReverseOfNumber 
{
    public static void main(String[] args) {
        int n,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        r=0;
        while(n!=0)
        {
            r=r*10+n%10;
            n=n/10;
        }
        System.out.println("Reverse number="+r);
    }
}
