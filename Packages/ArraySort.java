// program to sort an array in ascending order
import java.util.*;
class ArraySort 
{
    public static void main(String[] args) {
        int arr[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array element:");
        for(i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted element are:-");
        for(i=0;i<5;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
