// Enter three number and display greatest among them by using if else condition
import java.util.*;
class Greatest1
{
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number to check Greatesr:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("Greatest no...=" +a);
            }
            else
            {
                System.out.println("Greatest no...=" +c);
            }
        }
        else 
        {
            if(b>c)
            {
                System.out.println("Greatest no...=" +b);
            }
            else
            {
                System.out.println("Greatest no...="+c);
            }
     
        }
      
    }
}