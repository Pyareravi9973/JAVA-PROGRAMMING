import java.util.*;
class A 
{
    int x,y;
    void getdata1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two number:");
        x=sc.nextInt();
        y=sc.nextInt();
    }
}
class B extends A
{
    int z,m;
    void getdata2()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enetr any number:");
     m=sc.nextInt();
    }
    void calculate1()
    {
        z=x*y+m;
    }
    void display1()
    {
        System.out.println("Result="+z);
    }
}
class C extends A
{
    int n,p;
    void getdata3()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        n=sc.nextInt();
    }
    void calculate2()
    {
        p=(x-y)/n;
    }
    void display2()
    {
        System.out.println("Result="+p);
    }
}
class Hierarchical_Inheritance
{
    public static void main(String[] args) {
        B obj1=new B();
        C obj2=new C();
        obj1.getdata1();
        obj1.getdata2();
        obj1.calculate1();
        obj1.display1();
        obj2.getdata1();
        obj2.getdata3();
        obj2.calculate2();
        obj2.display2();
    }
}