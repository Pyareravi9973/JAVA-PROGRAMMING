//Wap for addition of two complex number and return ab object from a method//
import java.util.*;
class Comp
{
    int r,i;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real & imagenary number:");
        r=sc.nextInt();
        i=sc.nextInt();
    }
    Comp sum( Comp c2)
    {
      Comp t=new Comp();
      t.r=r+c2.r;
      t.i=i+c2.i;
      return t;
    }
    void display()
    {
        System.out.println("Real no:="+r);
        System.out.println("imagenary no:="+i);
    }
}
class ComplexNum
{
    public static void main(String[] args) {
        Comp c1=new Comp();
        Comp c2=new Comp();
        Comp c3=new Comp();
        c1.getdata();
        c2.getdata();
        c3=c1.sum(c2);
        c3.display();
    }
}
