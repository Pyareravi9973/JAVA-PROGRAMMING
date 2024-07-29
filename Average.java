//Enter three subject marks of any student and calculate the average
import java.util.*;
class Average 
{
    public static void main(String[] args) {
        int phy,che,math,sum,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of three subjects:");
        phy=sc.nextInt();
        che=sc.nextInt();
        math=sc.nextInt();
        sum=phy+che+math;
        avg=sum/3;
        System.out.println("Average=" +avg);

    }
}