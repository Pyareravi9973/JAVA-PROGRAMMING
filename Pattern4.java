/*   1 2 3 4 5
     2 3 4 5
     3 4 5
     4 5
     5
 */
class Pattern4
{
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
