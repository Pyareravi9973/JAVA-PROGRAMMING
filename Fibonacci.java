//Enter number of terms and generate fibonacci series.
import java.util.*;
class Fibonacci
{
    public static void main(String[] args) {
        int pp,p,c,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of term:");
        n=sc.nextInt();
        pp=0;
        p=1;
        System.out.print(pp+" "+p);
        for(i=3;i<=5;i++)
        {
            c=pp+p;
            System.out.print(" "+c);
            pp=p;
            p=c;
        }
    }
}
