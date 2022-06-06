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
public class IfStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Write a program that checks the age of a person, if under 16 cannot vote, if between 16 and 18 can vote for local council 
        //if above 18 can vote for the election. 
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Input your age: ");
        int age = scn.nextInt();
        
        if(age < 16){
            System.out.print("You cannot vote!");
       }else if((age>=16)&&(age<18)){
           System.out.print("You can vote for the local council");
       }else if(age>=18){
           System.out.print("You can vote fot the election");
       }   
    }
    
}
