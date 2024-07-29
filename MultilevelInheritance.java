import java.util.*;
class Student
{
    int rollno;
    void getdata1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rollno of the student:");
        rollno=sc.nextInt();
    }
}
class Subject extends Student
{
  int sub1,sub2;
  void getdata2()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two subject marks of any student:");
    sub1=sc.nextInt();
    sub2=sc.nextInt();
  }
}
class Result extends Subject
{
 int total;
 void calculate()
 {
    total=sub1 + sub2;
 }
 void display()
 {
    System.out.println("Rollno="+rollno);
    System.out.println("Total="+total);
 }
}
class MultilevelInheritance
{
    public static void main(String[] args) {
        Result obj=new Result();
        obj.getdata1();
        obj.getdata2();
        obj.calculate();
        obj.display();
    }
}
