import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SECPC106
 */
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*Ask the user to enter his/her name, gender and client ID
        Display a menu 
        1. Vegetables, and ask for qty, each one costs 50c
        2. Toys and ask for qty, each one costs 10 euro
        3. Watches, ask for qty, each one cost 100 euro
        
        Display error message, finally print the total, salutation, name and Id     
        */
        
        System.out.print("Input your name:");
        String name = scn.next();
        
        System.out.print("Input your client ID:");
        String clientid = scn.next();
        
        System.out.print("Male or Female?");
        String gender = scn.next();
        gender = gender.toLowerCase();
        
        System.out.println("\n====MENU====");
        System.out.print("1.Vegetables \n2.Toys \n3.Watches \nChoice:");
        int choice = scn.nextInt();
        double total;
        
             
        switch(choice){
            case 1: {
                System.out.print("Input the quantity: ");
                int qty = scn.nextInt();
                total = qty *(0.50);
                System.out.print("Total cost is " + total );
                if (gender.equals("male")){
                System.out.print("\n Thank you for your custom Mr "+ name + clientid );
             }else if(gender.equals("female")){
             System.out.println("\nThank you for your custom Mrs "+ name + "\nClientid: "+ clientid );
        }else System.out.print("---Gender incorect---");
            }break;
            
            
            case 2: {
                System.out.print("Input the quantity: ");
                int qty = scn.nextInt();
                total = qty *10;
                System.out.print("\nTotal cost is " + total );
                if (gender.equals ("male")){
                System.out.println("\nThank you for your custom Mr "+ name +  "\nclientid: "+ clientid );
        }
                else if(gender.equals("female")){
        System.out.print("\nThank you for your custom Mrs "+ name + "\nclientid: "+ clientid );
        }else System.out.print("---Gender incorect---");
                
            }break;
            
            
            case 3:{
                System.out.print("Input the quantity: ");
                int qty = scn.nextInt();
                total = qty *100;
                System.out.print("\nTotal cost is " + total );
                if (gender.equals ("male")){
                System.out.print("\nThank you for your custom Mr "+ name +  "\nclientid: "+ clientid );
             }
               else if(gender.equals("female")){
                System.out.println("\nThank you for your custom Mrs "+ name + "\nclientid: "+ clientid );
        }else System.out.print("---Gender incorect---");
            }break;
            
            default: System.out.print("Error");
            
           
    }
         
        
        
        
        
    }
}
    
