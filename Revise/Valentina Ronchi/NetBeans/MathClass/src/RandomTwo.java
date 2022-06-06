import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**`````````
 *
 * @author SECPC106
 */
public class RandomTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Generate random number where the range is added by the user
        
        System.out.print("Add the first number of the range: ");
        int first = scn.nextInt();
        
        System.out.print("Add the last number of the range: ");
        int last = scn.nextInt();
        
        int ans = (int)((Math.random()*last-first)+first);
        
        System.out.print("That's the random number: " + ans);

        
    }
    
}
