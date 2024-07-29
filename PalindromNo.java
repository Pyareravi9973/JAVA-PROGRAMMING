//Enter any number and check wether it is palindrom or not
import java.util.*;
class PalindromNo 
{
    public static void main(String[] args) {
        int n,n1,r;
        r=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr any number:");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
            r=r*10+n%10;
            n=n/10;
        }
        if(r==n1)
        {
            System.out.println("Palindrom number="+r);
        }
        else
        {
            System.out.println("Not palindrom number="+r);
        }
    }
}
