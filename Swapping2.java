 //Enter two number and swap both number:-  Method 2
import java.util.*;
class Swapping2
{
    public static void main(String[] args) {
        int x,y;//x=2,y=1
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value:");
        x=sc.nextInt();
        System.out.println("Enter second value:");;
        y=sc.nextInt();
        x=x+y;  // x=3
        y=x-y;  // y=2
        x=x-y;  // x=1
        System.out.println("After swapping:");
        System.out.println(x);
        System.out.println(y);
    }
}