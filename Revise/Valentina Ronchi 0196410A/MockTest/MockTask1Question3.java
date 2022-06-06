import java.util.Scanner;
/**
 * Write a description of class MockTask1Question3 here.
 * valentina ronchi id: 0196510A
 * @author (your name)
 * @version (a version number or a date)
 */
public class MockTask1Question3
{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose from the menu the coffee size");
        System.out.print("Menu\n1. Small (25c)\n2. Medium (50c)\n3. Large(75c)");
        int option = scn.nextInt();
        int money;
        int small=  25;
        int medium = 50;
        int large = 75;
        
        
        switch(option){
            
            case 1: {
                System.out.print("Input the amount of money in cents: ");
                money = scn.nextInt();
                if(money>small){
                    int change = money-small;
                    System.out.print("You receive a change of " + change + " c");
                    
                }else if (money == small){
                    System.out.print("You don't receive any change");
                    
                }
                else if (money<small){
                    System.out.print("You have to insert more money");
                }
            }break;
            case 2 :{
                System.out.print("Input the amount of money in cents: ");
                money = scn.nextInt();
                if(money>medium){
                    int change = money-medium;
                    System.out.print("You receive a change of " + change + " c");
                    
                }else if (money == medium){
                    System.out.print("You don't receive any change");
                    
                }
                else if (money<medium){
                    System.out.print("You have to insert more money");
                }
            }break;
            
            case 3 :{
                System.out.print("Input the amount of money in cents: ");
                money = scn.nextInt();
                if(money>large){
                    int change = money-large;
                    System.out.print("You receive a change of " + change + " c");
                    
                }else if (money == large){
                    System.out.print("You don't receive any change");
                    
                }
                else if (money<large){
                    System.out.print("You have to insert more money");
                }
            }break;
            default: System.out.print("Sorry! Wrong choice");break;
            
        }
    }
}
