import java.util.*;

class A  
{
    int n1,n2, r, b = 0, d=0,base = 1,ch;
 
     
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Decimal to binary:");
        System.out.println("2.Binary to decimal");
        System.out.println("Enter your choice:");
        ch=sc.nextInt();

        if(ch==1)
        {
            System.out.println("Enter a decimal number:");
            n1=sc.nextInt();
            while(n1>0)
            {
              r=n1%2;
              b=b+r*base;
              n1=n1/2;
              base=base*10;
            }    
               System.out.print("Binary number="+b);
          }
        else if(ch==2)
        {
          System.out.println("Enter a binary number:");  
          n2=sc.nextInt();
          while(n2>0)
          {
            r=n2%10;
            d=d+r*base;
            n2=n2/10;
            base=base*2;
          }
          System.out.println("Decimal number="+d);
        }
        else 
        {
            System.out.println("Invalid choice:");
        }
    }  
}

class NumberConversion
{
    public static void main(String[] args) {
        A obj=new A();
        obj.getdata();
    }
}