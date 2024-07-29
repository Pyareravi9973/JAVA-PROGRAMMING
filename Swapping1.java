//Enter two number and swap both number:-  Method 1
import java.util.*;
class Swapping1
{
    public static void main(String[] args) {
        int x,y,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value:");
        x=sc.nextInt();
        System.out.println("Emter second value:");
        y=sc.nextInt();
        t=x;
        x=y;
        y=t;
        System.out.println("After swapping:");
        System.out.println(x);
        System.out.println(y);

    }
}