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
public class RandomOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //output a random number between 1 and 15
        
        int random = (int)(Math.random()*15+1);
        System.out.print("This is the random number: " + random);
    }
    
}
