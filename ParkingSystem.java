/* car->50rs               c->1 2 3          prking vichel system    
   motorcycle->10rs        m->1 2 3 4 5      1.car                        Total car=3
   cycle->5rs              cy->1 2           2.motorcycle                 Total moto=5
                                             3.cycle                      Total cycle=2
                                             4.AmountCalculate            Amount=3*50+5*10+2*5=210
                                             5.Ecit
 */ 
import java.util.*;
class ParkingSystem
{
   public static void main(String[] args) {
      int car=0,motorcycle=0,cycle=0,Amount,choice;
      Scanner sc=new Scanner(System.in);
      System.out.println("Welcome to the Parking System:");
      do{
         System.out.println("1.Car:");
         System.out.println("2.motorcycle:");
         System.out.println("3.cycle:");
         System.out.println("4.Amount:");
         System.out.println("5.Exit:");
         System.out.println("Enter your choice:");
         choice=sc.nextInt();
         switch (choice) {
            case 1:
                   car++;
                   break;
            case 2:
                   motorcycle++;
                   break;
            case 3:
                   cycle++;
                   break;
            case 4:
                  System.out.println("The menus are:-");
                  System.out.println("car="+car);
                  System.out.println("motorcycle="+motorcycle);
                  System.out.println("cycle="+cycle);
                  Amount=car*50+motorcycle*10+cycle*5;
                  System.out.println("Amount="+Amount);
            case 5:
                  break;
   
            default:
                    System.out.println("Invalid choice:");
               break;
         }
      }while(choice!=0);
   }
}
