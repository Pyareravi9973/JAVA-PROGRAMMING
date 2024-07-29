// WAP to find square root of a given number.
import java.util.*;
class SquareRoot
{
    public static void main(String[] args) {
     int n;
     double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        r=Math.sqrt(n);
        System.out.println("Square Root="+r);

    }
}
