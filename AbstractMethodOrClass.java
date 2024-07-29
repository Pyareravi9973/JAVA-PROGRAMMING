//WAP For Abstract Class or Abstract Method//
import java.util.*;
abstract class A 
{
int x,y;
void getdata1()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any two number");
    x=sc.nextInt();
    y=sc.nextInt();
}
    abstract void display();
}
class B extends A 
{
    int m,z;
    void getdata2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        m=sc.nextInt();
    }
    void calculate()
    {
        z=x*y+m;
    }
    public void display()
    {
    System.out.println("Result="+z);  
    }
}
class AbstractMethodOrClass
{
    public static void main(String[] args) {
       B obj=new B();
       obj.getdata1();
        obj.getdata2();
        obj.calculate();
        obj.display();

    }
}