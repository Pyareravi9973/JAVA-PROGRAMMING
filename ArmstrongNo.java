//Enter any number and check wether it is armstrong number or not
import java.util.*;
class ArmstrongNo 
{
    public static void main(String[] args) {
        int n,n1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
        n1=n;
        while(n!=0)
        {
            sum=sum+(n%10)*(n%10)*(n%10);
            n=n/10;
        }
        if(sum==n1)
        {
            System.out.println("Armstrong number="+n1);
        }
        else{
            System.out.println("Not Armstrong number="+n1);
        }
    }
}