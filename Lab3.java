import java.util.*;
class prg3
{
    int x,y,z;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers:");
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
class Lab3
{
    public static void main(String[] args) {
        prg3 obj=new prg3();
        obj.getdata();
        obj.sum();
        obj.display();
    }
}
