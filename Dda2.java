//Enter value in matrix of size 3*3 and transpose all its element and display them on the screen
import java.util.*;
class Dda2
{
    public static void main(String[] args) {
        int x[][]=new int[3][3];
        int y[][]=new int[3][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in matrix of size 3*3:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++);
            {
                x[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                y[j][i]=x[i][j];
            }
        }
        System.out.println("Transpose matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(" "+y[i][j]);
            }
            System.out.println();
        }
    }
}