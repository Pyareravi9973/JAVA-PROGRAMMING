class A
{

    void getdata()
    {
        System.out.println("Inside class A getdata method:");
    }
}
class B extends A 
{
    void getdata()
    {
        System.out.println("Inside class B getdata method:");
    }
}
class Method_Overridden
{
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.getdata();
        obj2.getdata();
    }
}
