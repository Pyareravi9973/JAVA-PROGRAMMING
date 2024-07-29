class Add
{
    int x,y,z;
    void getdata(int a,int b)
    {
        x=a;
        y=b;
    }
    void getdata(int a)
    {
        x=a;
        y=a;
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
class Method_Overloading
{
    public static void main(String[] args) {
        Add obj1=new Add();
        Add obj2=new Add();
        obj1.getdata(5,10);
        obj1.sum();
        obj1.display();
        obj2.getdata(5);
        obj2.sum();
        obj2.display();
    }
}