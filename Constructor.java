//Wap for addition of two number//
class Add
{
    int x,y,z;
    Add (int a,int b)
    {
        x=a;
        y=b;
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
class Constructor
{
    public static void main(String[] args) {
        Add obj=new Add(5,10);
        obj.sum();
        obj.display();
    }
}