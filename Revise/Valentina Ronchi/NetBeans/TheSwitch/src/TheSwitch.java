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
public class TheSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Write a program that calculates the total price of a set of products the outputs a discount if the total is 
        //is less than 10 the discount is 5%, if the total is between 10 and 15 the discount is 10%, else 20%
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Input the quantity you want to buy");
        int qty = scn.nextInt();
        
        int ans = qty * 2;
        
        switch(ans){
            case 1: ;
            case 2: ;
            case 3: ;
            case 4: ;
            case 5: ;
            case 6: ;
            case 7: ;
            case 8: ;
            case 9: ;
            case 10: {
                double perc= 0.05*ans;          
                double total = (ans-perc);
                System.out.print("Your discount is 5% and you pay" + total);
            } break;
            case 11: ;
            case 12: ;
            case 13: ;
            case 14: ;
            case 15:{
                double perc = 0.10*ans;          
                double total = (ans-perc);
                System.out.print("Your discount is 10% and you pay" + total);
            } break;
            default:{
                double perc = 0.20*ans; 
                double total = (ans-perc);           
                System.out.print("Your discount is 20%, you pay:"+total); 
            }break;
            
        }
        
        
    }
    
}
