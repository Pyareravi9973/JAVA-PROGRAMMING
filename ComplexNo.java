//Wap for addition of two complex number using class and object//
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
    void sum(Comp C2)
    {
        r=r+C2.r;
        i=i+C2.i;
    }
    void display()
    {
        System.out.println("Real no.="+r);
        System.out.println("imagenary no.="+i);
    }
}
class ComplexNo
{
    public static void main(String[] args) {
        Comp c1=new Comp();
        Comp c2=new Comp();
        c1.getdata();
        c2.getdata();
        c1.sum(c2);
        c1.display();
    }
}