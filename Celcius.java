// Enter temperature in finite state and display its celcius equivalent using formula cl=(ft-32)/1.8
import java.util.*;
class Celcius
{
    public static void main(String[] args) {
        float f,t,cl;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in finite state:");
        f=sc.nextFloat();
        System.out.println("Enter time:");
        t=sc.nextFloat();
        cl=(f * t - 32)/1.8f;
        System.out.println("Celcius=" +cl);


    }
} 
