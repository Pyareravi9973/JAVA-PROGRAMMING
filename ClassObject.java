import java.util.*;
class LabPrg3
{
    int x,y,z;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
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
    class ClassObject
    {
        public static void main(String[] args)
         {
            LabPrg3 obj=new LabPrg3();
            obj.getdata();
            obj.sum();
            obj.display();

        }
    }

