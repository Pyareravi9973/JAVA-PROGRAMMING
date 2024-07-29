
//Enter any number and find its factorial
import java.util.*;
class Fact 
{
    public static void main(String[] args) {
        int n,f,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        f=1;
        i=1;
        while(i<=n)
        {
            f=f*i;
            i++;
        }
        System.out.println("factorial="+f);
    }
}
