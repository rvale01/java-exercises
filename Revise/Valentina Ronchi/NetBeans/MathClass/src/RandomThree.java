/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SECPC106
 */
public class RandomThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //output a random character, range 65-90
        
        int first = 65;
        int last = 90;
        
        int x = (int)((Math.random()*(last-first))+first);        
        char ch = (char) x;
        //char x = (char)((Math.random()*(last-first))+first);
        System.out.println(ch);   
        
         int y = (int)((Math.random()*(last-first))+first);        
        char second = (char) y;
        System.out.println(second);   
        
         int r = (int)((Math.random()*(last-first))+first);        
        char third = (char) r;
        System.out.println(third);   
        
         int z = (int)((Math.random()*(last-first))+first);        
        char fourth = (char) z;
        System.out.println(fourth);   
        
        int p = (int)((Math.random()*(last-first))+first);        
        char fifth = (char) p;
        System.out.println(fifth);   
    }
    
}
