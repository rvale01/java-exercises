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
public class UsingCharAt {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
    
    System.out.print("Input your surname: ");
    String name = scn.next();
    
    System.out.print("Which char do you want to show? ");
    int x = scn.nextInt();
    
    char ch = name.charAt(x); 
    System.out.print(ch);
    
    
    }
    
}
