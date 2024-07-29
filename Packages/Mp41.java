/*Mp41 */
import java.util.*;
public class Mp41
{
    public static void main(String[] args) {
        int v=0,c=0,b=0,l;
        String str=new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line: ");
        str = sc.nextLine();
        str=str.trim();
        l=str.length();
        str=str.toUpperCase();
        for (int i = 0; i <l; i++)
        {
            if (str.charAt(i)==' ')
            {
                b++;
            }
            if (str.charAt(i)=='A' || str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
               v++; 
            }
        }
        System.out.println("Number of Character "+l);
        System.out.println("Number of spaces: "+b);
        System.out.println("Number of words "+(b+1));
        System.out.println("Number of Vowel "+v);
        System.out.println("Number of Conconent "+(l-v-b));

    }
}