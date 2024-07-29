import java.util.*;
class Student
{
    int rollno;
    void getdata1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll number:");
        rollno=sc.nextInt();
    }
}
class Subject extends Student
{
    int sub1,sub2;
    void getdata2()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr marks of two subject:");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
    }
}
abstract interface Sport 
{
    final int sm=2;
     abstract void display();
}
class Result extends Subject implements Sport
{
    int total;
    void getdata3()
    {
        total=sub1+sub2+sm;
    }
    public void display()
    {
        System.out.println("Roll number="+rollno);
        System.out.println("Result="+total);
    }
}
class Interface1
{
    public static void main(String[] args) {
        Result obj=new Result();
        obj.getdata1();
        obj.getdata2();
        obj.getdata3();
        obj.display();

    }
}