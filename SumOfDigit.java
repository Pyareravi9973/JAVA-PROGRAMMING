//Enter any number and display the sum of its digit
import java.util.*;
class SumOfDigit 
{
    public static void main(String[] args) {
        int n,sum;
        sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any numer:");
        n=sc.nextInt();
        while(n!=0)
        {
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("sum of digit="+sum);
    }
}