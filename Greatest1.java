
// Enter three number and display greatest among them by using simple if condition
import java.util.*;

class Greatest1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number to find Greatest of them:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b) {
            if (a > c) 
            {
                System.out.println("Greatest no.. is:=" + a);
            }
        }
        if (b > a)
         {
            if (b > c)
             {
                System.out.println("Greatest no.. is=" + b);
            }
        }
        if (c > a) 
        {
            if (c > b) 
            {
                System.out.println("Greatest no. is=" + c);
            }
        }
    }
}
