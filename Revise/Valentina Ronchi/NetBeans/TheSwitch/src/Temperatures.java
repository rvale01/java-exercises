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
public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Write a program that accepts a value from the user. This value must be within the range
        of -1 to 40.(if statement)
        print the following:
        1. "freezing" if the temperature is 10 or below. 
        2. "moderate" if the temperature is between 10 and 25
        3. "Hell on Earth" if temperature is above 25 
        (use switch or if)
        */
        Scanner snc = new Scanner(System.in);
        
        System.out.print("Enter the temperature: ");
        int temp = snc.nextInt();
        
        while(temp>40 || temp<-1){
            System.out.print("Incorrect value! Try again: ");
            System.out.print("Enter the temperature: ");
                    temp = snc.nextInt();
              }
        if (temp<=10){
            System.out.print("Freezing\n");
        }else if (temp>10&&temp<=25){
            System.out.print("Moderate\n");
        }else if (temp>25){
            System.out.print("Hell on Earth!\n");
            }
        double fah = (temp * 1.8) + 32;
        System.out.print("The value converted in Fahrenheit is : "+fah+"\n");
    
    }
    
}
