//program to find out the sum and average of the elements present in an array
import java.util.*;
class ArraySumAverage 
{
    public static void main(String[] args) {
        int arr[]=new int[5];
        int i,sum=0;
        double avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array element:-");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/5;
        System.out.println("Sum="+sum);
        System.out.println("Average="+avg);
    }
}
