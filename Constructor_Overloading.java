class Add
{
    int x,y,z;
    Add(int a,int b)
    {
        x=a;
        y=b;
    }
    Add(int a)
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
class Constructor_Overloading
{
    public static void main(String[] args) {
        Add obj1=new Add(5,10);
        Add obj2=new Add(5);
        obj1.sum();
        obj1.display();
        obj2.sum();
        obj2.display();
    }
}