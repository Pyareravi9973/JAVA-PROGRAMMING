//Enter marks of three subject of any student and claculate average using Class & object
//By Direct
class Average
{
    int phy,chem,math,sum;
    double avg;
    void getdata(int a,int b,int c)
    {
      phy=a;
      chem=b;
      math=c;
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
class ClassObj3
{
    public static void main(String[] args) {
        Average obj=new Average();
        obj.getdata(80,85,90);
        obj.Total();
        obj.aver();
        obj.display();
    }
}