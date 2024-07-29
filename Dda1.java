//Enter value in matrix of size 3*3 and access all the element and display them on the screen
import java.util.*;
class Dda1
{
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in matrix of size 3*3:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
             arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Accessing all element and display on the screen:");
        {
            for(i=0;i<3;i++)
            {
                for(j=0;j<3;j++)
                {
                    System.out.print(" "+arr[i][j]);
                }
                System.out.println();
            }
        }
    }
}