// Adding of two number and value passes through Runtime //
import java.util.*;
class Adding
{
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        x=sc.nextInt();
        y=sc.nextInt();
        z=x+y;
        System.out.println("Addition=" +z);
    }
}