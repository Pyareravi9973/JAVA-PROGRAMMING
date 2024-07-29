
// Enter three number and display greatest among them by using if else if
import java.util.*;

class Greatest3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three no. to check Greatest no.");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b && a > c) 
        {
            System.out.println("Greatest no.=" + a);
        }
         else if (b > c) 
         {
            System.out.println("Greatest no.=" + b);
         } 
        else 
        {
            System.out.println("Greatest no.=" + c);
        }
    }
}