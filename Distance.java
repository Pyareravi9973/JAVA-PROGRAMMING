//Enter initial velocity acceleration and time and calculate distance using formula s=ut+1/2at^2
import java.util.*;
class Distance
{
public static void main(String[] args) {
    double u,a,t,s;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter velocity:");
    u=sc.nextDouble();
    System.out.println("Enter accelaration:");
    a=sc.nextDouble();
    System.out.println("Enter time:");
    t=sc.nextDouble();
    s=u * t + 0.5 * a * t * t;
    System.out.println("Distance=" +s);
}
}