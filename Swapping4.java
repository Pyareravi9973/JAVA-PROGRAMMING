//Enter two number and swap both number:-  Method 4
import java.util.*;
class Swapping4
{
    public static void main(String[] args) {
        int x,y;  //x=10,y=20
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value:");
        x=sc.nextInt();
        System.out.println("Enter second value:");
        y=sc.nextInt();
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After swapping:");
        System.out.println(x);
        System.out.println(y);
    }
}