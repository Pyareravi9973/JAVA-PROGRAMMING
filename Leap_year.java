//Enter any year and check wether it is leap year or not
import java.util.*;
class Leap_year
{
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Year to check wether it is leap year or not:");
        year=sc.nextInt();
        if(year%4==0 && year%100!=0  || year%400==0 )
        {
            System.out.println("it is leap year:");
        }
        else
        {
           System.out.println("it is not a leap year:");
        }

    }
}
