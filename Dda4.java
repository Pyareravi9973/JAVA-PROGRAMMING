//Wap for multiplication of two matrix of size 3*3
import java.util.*;
class Dda4
{
    public static void main(String[] args) {
        int x[][]=new int[10][10];
        int y[][]=new int[10][10];
        int z[][]=new int[10][10];
        int i,j,k,r1,r2,c1,c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row of the first matrix");
        r1=sc.nextInt();
        System.out.println("enter column of the first matrix");
        c1=sc.nextInt();
        System.out.println("Enter value in 1st matrix:");
        System.out.println("enter row of the first second matrix");
        r2=sc.nextInt();
        System.out.println("enter column of the first second matrix");
        c2=sc.nextInt();
        if(c1==r2)
        {
        System.out.println("Enter value in 1st matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter value in 2nd matrix:");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                y[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c2;j++)
            {
                z[i][j]=0;
                for(k=0;k<c1;k++)
                {
                    z[i][j]=z[i][j]+x[i][k]*y[k][j];
                }
            }
        }
    
        System.out.println("Resultant matrix");
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
}
