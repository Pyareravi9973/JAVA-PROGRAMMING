
//Wap for addition of two number using class & object by Runtime.
import java.util.*;
class Add {
    int x, y, z;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number:");
        x=sc.nextInt();
        y=sc.nextInt();
    }
    void sum()
    {
        z=x+y;
    }
    void display()
    {
        System.out.println("Addition="+z);
    }
}
class ClassObj
{
  public static void main(String args[])
  {
    Add obj=new Add();
    obj.getdata();
    obj.sum();
    obj.display();
  }
}