import java.util.Scanner;

import pack1.A;
class B extends A
 {
  int m,z;
  void getdata2()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number:");
    m=sc.nextInt();
    }
    void calculate()
     {
      z=x*y+m;
      }
    void display()
    {
     System.out.println("Result="+z);
     }
   }
  class C
  {
    public static void main(String args[])
    {
     B obj=new B();
     obj.getdata1();
     obj.getdata2();
     obj.calculate();
     obj.display();
     }
   }