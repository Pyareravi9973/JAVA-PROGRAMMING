//Enter any number and check wether it is prime or not
import java.util.*;
class PrimeOrNot
{
    public static void main(String[] args) {
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("prime number="+n);
        }
        else
        {
            System.out.println("Not prime number="+n);
        }
    }
}