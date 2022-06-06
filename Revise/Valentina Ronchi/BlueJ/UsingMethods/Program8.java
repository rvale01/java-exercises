import java.util.Scanner;
/**
 * Write a description of class Program8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * A grocery store needs to comuterize the system with the following options:
 * 1. Display a list of available items (5 or six items in an array) and their price.(2 arrays)
 * 2. Choose your item to buy the user will only be able to choose 1 item and ask for quantity
 * 3. Display the total
 * 4. Display the discount(5%)
 * 5. Exit
 * All oprions must be in a method with a return and parameters;
 */
public class Program8
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String [] items = new String [4];
        items[0] ="Apples";
        items[1]="Oranges";
        items[2]="Lemons";
        items[3]="Cherries";
               
        
        double [] price = new double [5];
        price[0] =1.00;
        price[1] = 2.00;
        price[2] = 1.50;
        price[3] = 1.20;
        price[4] = 3.00;
        
        int quantity = 0;
        int choice= 0;
        boolean b= false;
        double disc = 0.0;
        double total= 0.0;
        do{
           System.out.print("1. Display a list of available items and their price. \n2. Choose your item to buy \n3. Display the total \n4. Display the discount \n5. Exit\n");
            int option = scn.nextInt();
        
               switch(option){
                   case 1: displayItems(items, price); break;
                   case 2: {
                       System.out.print("Input choice");
                       choice = scn.nextInt();
                       quantity = quantity(choice);
                    } break;
                    case 3: {
                        total = total(choice, price, quantity);
                        System.out.println(total);
                       
                    };break;
                    case 4:{
                       disc = discount(total);
                       System.out.println(disc);
                    }break;
                   case 5: {
                       b = true;
                    }break;
        }
        
    }while(b!=true);
   }
   
   public static void displayItems(String [] items, double [] price){
       int x;
       for(x = 0;x<4;x++){
           int pos = x+1;
        System.out.println(pos+". " + items[x] + " "+ price[x]);
    }
    
    }
    
    public static int quantity(int choice){
        Scanner scn = new Scanner(System.in);
        System.out.print("Input quantity");
        int quantity = scn.nextInt();
        return quantity;
    }
    
    public static double total(int choice, double[] price, double quantity){
        double total;
        int pos = choice - 1;
        total = price[pos] * quantity;
        return total;
    }
    
    public static double discount( double total){
        double dis = total - (0.5*total);
        return dis;
    }
}
