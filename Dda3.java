//Wap for addition of two matrix of size 3*3
import java.util.*;
class Dda3
{
    public static void main(String[] args) {
        int x[][]=new int[3][3];
        int y[][]=new int[3][3];
        int z[][]=new int[3][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in first matrix of size 3*3:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                x[i][j]=sc.nextInt();
            }
        } 
        System.out.println("Enter value in second matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                y[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                z[i][j]=x[i][j]+y[i][j];
            }
        }
        System.out.println("resultant Matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(" "+z[i][j]);
            }
            System.out.println();
        }
    }
}
