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
/* ask the user to enter his or her group letter, for example A,B,C and X,Y,Z, a message will be displayed
        if the input is A, print "lessons are Monday and Tuesday"
        if the input is B or , print "lessons are Friday"
        if the input is X and Y, print "Thursday and Wednesday"
        else "Not valid"
        the switch must work with a char data type
        */
public class CharacterChoice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input a value between A,B,C,X,Y,Z:");
        String value = scn.next();
        String choice = value.toLowerCase();
           char ch = choice.charAt(0);
           
           switch(ch){
               case 'a': System.out.print("Your lessons are on Monday and Tuesday!");break;
               case 'b': ;
               case 'c': System.out.print("Your lessons are on Friday");break;
               case 'x': ;
               case 'y': System.out.print("Your lessons are on Thursday");break;
               case 'z': System.out.print("Your lessons are on Wednesday");break;
               default: System.out.print("Not valid"); break;
               
                   
           }
           
           
           
    }
    
}
