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
public class Seasons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the user will enter a value between 1 to 12, 1 for january..., output season
        //Write a program that outputs the seasons accourding to the month entered
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Input the number of the month: ");
        int month = scn.nextInt();
        
         switch(month){
             case 12: ;
             case 1: ;
             case 2: System.out.print("Winter"); break;
             case 3: ;
             case 4: ;
             case 5: System.out.print("Spring"); break;
             case 6: ;
             case 7: ;
             case 8: System.out.print("Summer"); break;
             case 9: ;
             case 10: ;
             case 11: System.out.print("automn"); break;
             default: System.out.print("error");break;
             
             
                     
         }      
            
    }
    
}
