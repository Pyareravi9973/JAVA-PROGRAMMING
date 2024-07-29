// Enter any number and check wether it is even or odd without using % operator
import java.util.*;
class CheckEvenOrOdd
{
    public static void main(String[] args) {
        int n,t=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        if((n&t) == 0)
        {
          System.out.println("Even no..="+n);
        }
        else
        {
          System.out.println("odd no..="+n);
        }
    }
}