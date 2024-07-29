//program to enter principal rate & time and find simple intrest
import java.util.*;
class SimpleIntrest
{
    public static void main(String[] args) {
        float p,r,t,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr principal amount, rate and time:");
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        si=p*r*t/100;
        System.out.println("Simple Intrest="+si);
    }
}