// Enter any number and display it table
import java.util.*;
class TableOfNumber
{
    public static void main(String[] args) {
        int n,i,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        i=1;
        while(i<=10)
        {
            t=n*i;
            System.out.println(" "+t);
            i++;
        }
    }
}