//Enter 5 no. and store them in an array and access all the no. and display them on the screen
import java.util.*;
class Sda1
{
    public static void main(String[] args) {
        int a[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five numbers:");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Accessing all number and display them on the screen:");
        for(i=0;i<5;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}