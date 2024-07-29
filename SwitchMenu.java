/*Enter any two number 10    5 
 1.   Addition
 2.   subttraction
 3.   division
 4.    multiplication
 5.    exit
 Enter your choice
*/
import java.util.*;
class SwitchMenu
{
    public static void main(String[] args) {
        int n1,n2,r,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any to number:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println( "1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("division");
        System.out.println("Multiplication");
        System.out.println("Exit");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1: r=n1+n2;
                    System.out.println("Addition="+r);
                    break;
            case 2:  r=n1-n2;
                     System.out.println("Subtraction="+r);
                     break;
            case 3:  r=n1/n2;
                     System.out.println("Division="+r);
                     break;
            case 4:  r=n1*n2;
                     System.out.println("Multiplication="+r);
                     break;

            case 5:  break;
           
            default : System.out.println("Invalid choice:");
        }
    }
}