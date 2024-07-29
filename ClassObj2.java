//Enter marks of three subject of any student and claculate average using Class & object
//By Run Time
import java.util.*;
class Average
{
    int phy,chem,math,sum;
    double avg;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of three subject:");
        phy=sc.nextInt();
        chem=sc.nextInt();
        math=sc.nextInt();
    }
    void Total()
    {
        sum=phy+chem+math;
    }
    void aver()
    {
        avg=sum/3;
    }
    void display()
    {
        System.out.println("Average="+avg);
    }
}
class ClassObj2
{
    public static void main(String[] args) {
        Average obj=new Average();
        obj.getdata();
        obj.Total();
        obj.aver();
        obj.display();
    }
}
