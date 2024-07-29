//Wap for addition of two number using class & object by Direct.
import java.util.*;
class Add
{
  int x,y,z;
  void getdata(int a,int b)
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
class ClassObj1
{
    public static void main(String[] args) {
        Add obj=new Add();
        obj.getdata(10,20);
        obj.sum();
        obj.display();
    }
}
