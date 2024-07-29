// Enter three number and display greatest among them without using any if else
import java.util.*;
class Greatest4
{
    public static void main(String[] args) {
        int x,y,z,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three no..");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        temp=( (x>y) && (x>z) )?x:( (y>z?y:z) );
        System.out.println("Greatest number="+temp);
    }
}