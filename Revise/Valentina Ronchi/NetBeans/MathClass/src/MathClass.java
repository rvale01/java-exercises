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
public class MathClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Using Math.pow class ask the user to enter two values and the output the answer. 
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Input the value of the base: ");
        int base = scn.nextInt();
        
        System.out.print("Input the value of the power: ");
        int power = scn.nextInt();
        
        int result = (int)Math.pow(base, power);
        
        System.out.print("The result is: " + result);
    }
    
}
