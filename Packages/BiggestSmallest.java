//program to find out the biggest and smallest number from a matrix
import java.util.*;
class BiggestSmallest 
{
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int i,j,lrg,sml;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element in matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix are");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
             System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        lrg=arr[0][0];
        sml=arr[0][0];
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
              if(arr[i][j]>lrg)
              {
                lrg=arr[i][j];
              }
              if(arr[i][j]<sml)
              {
                sml=arr[i][j];
              }
            }
        }
        System.out.println("Largest number="+lrg);
        System.out.println("Smallest number="+sml);
    }
}
