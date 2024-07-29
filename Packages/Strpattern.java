/*Enter any string display its character as bellow
   input-> hello
   output->h
           he
           hel
           hell
           hello
*/
import java.util.*;
class Strpattern
{
        public static void main(String[] args) {
                String s1=" ";
                int l,i,j;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter any string");
                s1=sc.next();
                l=s1.length();
                for(i=0;i<l;i++)
                {
                        for(j=0;j<=i;j++)
                        {
                           System.out.print(s1.charAt(j));
                        }
                        System.out.println();
                }
        }
}