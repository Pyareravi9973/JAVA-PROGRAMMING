/*Enter any three subject marks of any student and calculate the average marks
 if average marks >=75 then display distunction
 if avg marks>=60 and avg marks<75 then display 1st div
 if vag marks>=45 and avg marks<60 then display 2nd div
 otherwise failed
 */
import java.util.*;
class Avg_marks
{
    public static void main(String[] args) {
        int x,y,z,sum,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three subject marks:");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        sum=x+y+z;
        avg=sum/3;
        if(avg>=75)
        {
            System.out.println("distunction");
        }
        else if(avg>=60 && avg<75)
        {
            System.out.println("1st div");
        }
        else if(avg>=45 && avg<60)
        {
            System.out.println("2nd div");
        }
        else
        {
            System.out.println("Failed");
        }

    }
}